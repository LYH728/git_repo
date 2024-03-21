package com.fudan.ast.grpcuserserver.repository;

import com.fudan.ast.grpcuserserver.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(@Pattern(regexp = "^[a-zA-Z\\-_][a-zA-Z0-9\\-_]{4,31}$", message = "Invalid username format") String username);

    Optional<User> findByEmail(@Email(message = "Invalid email format") String email);

    Optional<List<User>> findAllByUsername(@Pattern(regexp = "^[a-zA-Z\\-_][a-zA-Z0-9\\-_]{4,31}$", message = "Invalid username format") String username);

}
