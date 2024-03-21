package com.fudan.ast.conferenceserver.repository;


import com.fudan.ast.conferenceserver.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Optional<UserEntity> findByUsername(@Pattern(regexp = "^[a-zA-Z\\-_][a-zA-Z0-9\\-_]{4,31}$", message = "Invalid username format") String username);

    Optional<UserEntity> findByEmail(@Email(message = "Invalid email format") String email);

}
