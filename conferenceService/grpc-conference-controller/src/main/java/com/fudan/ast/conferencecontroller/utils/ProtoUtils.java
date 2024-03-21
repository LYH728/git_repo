package com.fudan.ast.conferencecontroller.utils;

import com.fudan.ast.conferencecontroller.pojo.ConferenceResponseDO;
import com.fudan.ast.grpc.lib.Conference.Conference;
import com.google.protobuf.Timestamp;

public class ProtoUtils {
    public static Timestamp toTimestamp(java.util.Date date) {
        if (date == null) {
            return null;
        }

        long seconds = date.getTime() / 1000;
        int nanos = (int) ((date.getTime() % 1000) * 1_000_000);
        return Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();
    }



    public static java.util.Date fromTimestamp(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }

        long milliseconds = timestamp.getSeconds() * 1000 + timestamp.getNanos() / 1_000_000;
        return new java.util.Date(milliseconds);
    }


    public static ConferenceResponseDO fromConference(Conference conference){
        ConferenceResponseDO response = new ConferenceResponseDO();
        response.setId(conference.getId());
        response.setShortName(conference.getShortName());
        response.setFullName(conference.getFullName());
        response.setStartDate(ProtoUtils.fromTimestamp(conference.getStartDate()));
        response.setEndDate(ProtoUtils.fromTimestamp(conference.getEndDate()));
        response.setLocation(conference.getLocation());
        response.setChairId(conference.getChairId());
        response.setSubmissionStartDate(ProtoUtils.fromTimestamp(conference.getSubmissionStartDate()));
        response.setSubmissionEndDate(ProtoUtils.fromTimestamp(conference.getSubmissionEndDate()));
        response.setStatus(response.getStatus());
        return response;
    }

}
