package com.fudan.ast.grpcpapercontroller.pojo;

import lombok.Data;

@Data
public class Submission {
    private String conferenceID;
    private String title;
    private String abstractText;
    private String submitterID;
    private String paperFileID;


    public Submission() {
    }

    public Submission(String conferenceID, String title,
                      String abstractText,String submitterID,
                      String paperFileID) {
        this.conferenceID = conferenceID;

        this.submitterID = submitterID;
        this.title = title;

        this.abstractText = abstractText;

        this.paperFileID = paperFileID;

    }
}
