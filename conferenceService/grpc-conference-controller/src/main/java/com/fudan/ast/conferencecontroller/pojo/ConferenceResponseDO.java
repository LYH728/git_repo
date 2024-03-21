package com.fudan.ast.conferencecontroller.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class ConferenceResponseDO {

    private int id;

    private String shortName;

    private String fullName;

    private Date startDate;

    private Date endDate;

    private String location;

    private Date submissionStartDate;

    private Date submissionEndDate;

    private int status;

    private int chairId;

    // 生成getter和setter方法

}