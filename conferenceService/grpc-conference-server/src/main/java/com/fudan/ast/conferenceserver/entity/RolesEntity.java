package com.fudan.ast.conferenceserver.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "roles")
public class RolesEntity {

    @Id
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

}
