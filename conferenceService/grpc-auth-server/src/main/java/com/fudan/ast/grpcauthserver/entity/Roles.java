package com.fudan.ast.grpcauthserver.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Roles {

    @Id
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

}
