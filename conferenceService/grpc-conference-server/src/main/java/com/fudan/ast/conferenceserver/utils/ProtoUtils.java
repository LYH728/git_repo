package com.fudan.ast.conferenceserver.utils;

import com.fudan.ast.conferenceserver.entity.ConferenceStatusEntity;
import com.fudan.ast.grpc.lib.Conference.Conference;
import com.google.protobuf.Timestamp;
import com.fudan.ast.grpc.lib.Conference.ConferenceStatus;

public class ProtoUtils {
    public static Timestamp toTimestamp(java.util.Date date) {
        if (date == null) {
            return null;
        }

        long seconds = date.getTime() / 1000;
        int nanos = (int) ((date.getTime() % 1000) * 1_000_000);
        return Timestamp.newBuilder().setSeconds(seconds).setNanos(nanos).build();
    }

    public static ConferenceStatus mapStatusEntityToProto(ConferenceStatusEntity conferenceStatusEntity) {
        if (conferenceStatusEntity != null) {
            int statusId = conferenceStatusEntity.getId();
            switch (statusId) {
                case 1:
                    return ConferenceStatus.PREPARING;
                case 2:
                    return ConferenceStatus.SUBMITTING;
                case 3:
                    return ConferenceStatus.REVIEWING;
                case 4:
                    return ConferenceStatus.FINAL_JUDGMENT;
                case 5:
                    return ConferenceStatus.REVIEW_COMPLETED;
                default:
                    return ConferenceStatus.PREPARING; // 默认状态
            }
        } else {
            return ConferenceStatus.PREPARING; // 如果状态实体为 null，返回默认状态
        }
    }

    public static java.util.Date fromTimestamp(Timestamp timestamp) {
        if (timestamp == null) {
            return null;
        }

        long milliseconds = timestamp.getSeconds() * 1000 + timestamp.getNanos() / 1_000_000;
        return new java.util.Date(milliseconds);
    }

    public static ConferenceStatusEntity mapProtoToStatusEntity(ConferenceStatus conferenceStatus) {
        ConferenceStatusEntity statusEntity = new ConferenceStatusEntity();
        switch (conferenceStatus) {
            case PREPARING:
                statusEntity.setId(1);
                statusEntity.setName("PREPARING");
                break;
            case SUBMITTING:
                statusEntity.setId(2);
                statusEntity.setName("SUBMITTING");
                break;
            case REVIEWING:
                statusEntity.setId(3);
                statusEntity.setName("REVIEWING");
                break;
            case FINAL_JUDGMENT:
                statusEntity.setId(4);
                statusEntity.setName("FINAL_JUDGMENT");
                break;
            case REVIEW_COMPLETED:
                statusEntity.setId(5);
                statusEntity.setName("REVIEW_COMPLETED");
                break;
            default:
                // 默认状态
                statusEntity.setId(1);
                statusEntity.setName("PREPARING");
        }
        return statusEntity;
    }


}
