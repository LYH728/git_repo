package com.fudan.ast.conferenceserver.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;

@Entity
@Data
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Pattern(regexp = "^[a-zA-Z\\-_][a-zA-Z0-9\\-_]{4,31}$", message = "Invalid username format")
    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*[0-9\\-_]).{6,32}$", message = "Password must contain at least one letter, one number or special character(-_) and be 6-32 characters long")
    @Column(nullable = false, length = 50)
    private String password;

    @Email(message = "Invalid email format")
    @Column(nullable = false, length = 100)
    private String email;

    @Column(length = 100)
    private String affiliation;

    @Column(length = 100)
    private String location;

    @Column(nullable = false)
    private Boolean is_admin = false;

}
