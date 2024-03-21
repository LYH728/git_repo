package com.fudan.ast.grpcpaperserver.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Submission.proto")
public class Submission {

    public Submission() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "conference_id")
    private int conferenceId;

    private String title;

    private String abstractText;

    @Column(name = "submitter_id")
    private int submitterId;


    @Column(name = "paper_file_path")
    private String paper_file_path;

    private String status;

    @ManyToOne
    @JoinColumn(name = "conference_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Conference conference;

    @ManyToOne
    @JoinColumn(name = "submitter_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User submitter;



    // Constructors, getters, and setters
}
