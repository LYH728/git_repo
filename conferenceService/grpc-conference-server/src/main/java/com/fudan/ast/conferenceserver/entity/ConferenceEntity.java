package com.fudan.ast.conferenceserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "conferences")
public class ConferenceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String short_name;

    @Column(length = 200)
    private String full_name;

    @Temporal(TemporalType.DATE)
    private Date start_date;

    @Temporal(TemporalType.DATE)
    private Date end_date;

    @Column(length = 100)
    private String location;

    @Temporal(TemporalType.DATE)
    private Date submission_start_date;

    @Temporal(TemporalType.DATE)
    private Date submission_end_date;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private ConferenceStatusEntity status;

    @ManyToOne
    @JoinColumn(name = "chair_id", referencedColumnName = "id")
    private UserEntity chair;

}
