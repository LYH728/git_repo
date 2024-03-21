package com.fudan.ast.grpcauthserver.service;

import com.fudan.ast.grpc.lib.*;
import com.fudan.ast.grpcauthserver.entity.User;
import com.fudan.ast.grpcauthserver.repository.UserRepository;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.*;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Optional;

@GrpcService
public class AuthService extends AuthServiceGrpc.AuthServiceImplBase {

    @Value("${jwt.signing.key}")
    String jwtSecretKey;

    @Autowired
    private UserRepository userRepository;

    @Override
    public void generateJwtToken(JwtRequest request, StreamObserver<JwtTokenResponse> responseObserver) {
        Instant now = Instant.now();
        Instant expiration = now.plus(1, ChronoUnit.HOURS);

        String email = request.getEmail();
        String password = request.getPassword();

        String role;

        Optional<User> optionalUser = userRepository.findByEmail(email);
        if (optionalUser.isPresent() && optionalUser.get().getPassword().equals(password)) {
            User user = optionalUser.get();
            if (user.getIs_admin()) {
                role = "ROLE_ADMIN";
            } else {
                role = "ROLE_USER";
            }
            responseObserver.onNext(JwtTokenResponse.newBuilder().setJwtToken(Jwts.builder()
                    .setSubject(request.getEmail())
                    .claim("auth", role)
                    .setIssuedAt(Date.from(now))
                    .setExpiration(Date.from(expiration))
                    .signWith(SignatureAlgorithm.HS512, jwtSecretKey)
                    .compact()).setValid(true).build());
            responseObserver.onCompleted();
        } else {
            responseObserver.onNext(JwtTokenResponse.newBuilder().setValid(false).build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void validate(JwtToken request, StreamObserver<ValidateResponse> responseObserver) {
        try {
            Jws<Claims> claims = Jwts.parser().setSigningKey(jwtSecretKey).parseClaimsJws(request.getJwtToken());
            String role = (String) claims.getBody().get("auth");
            responseObserver.onNext(ValidateResponse.newBuilder()
                    .setValid(true)
                    .setRole("ROLE_ADMIN".equals(role) ? Roles.ROLE_ADMIN : Roles.ROLE_USER)
                    .build());
        } catch (JwtException e) {
            responseObserver.onNext(ValidateResponse.newBuilder()
                    .setValid(false)
                    .build());
        }
        responseObserver.onCompleted();
    }
}
