package com.fudan.ast.grpcpaperserver.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "Conference")
public class Conference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // Define other columns for conferences table
//
    @OneToMany(mappedBy = "conference")
    private List<Submission> Submissions;

    // Constructors, getters, and setters
}
