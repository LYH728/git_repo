package com.fudan.ast.conferenceserver.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@Table(name = "user_conferences")
@IdClass(UserConferenceId.class)
public class UserConferenceEntity implements Serializable {

    @Id
    private Integer userId; // 存储用户id

    @Id
    private Integer conferenceId;

    @Column(name = "role_id")
    private Integer roleId;

    // getter和setter

}
