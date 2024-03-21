package com.fudan.ast.grpcauthserver.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "conference_status")
public class ConferenceStatus {

    @Id
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

}
