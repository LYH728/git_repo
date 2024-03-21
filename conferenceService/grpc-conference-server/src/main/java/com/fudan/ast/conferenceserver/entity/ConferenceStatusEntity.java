package com.fudan.ast.conferenceserver.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "conference_status")
public class ConferenceStatusEntity {

    @Id
    private Integer id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

}
