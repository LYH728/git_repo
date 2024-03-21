package com.fudan.ast.conferenceserver.service;

import com.fudan.ast.conferenceserver.entity.ConferenceEntity;
import com.fudan.ast.conferenceserver.entity.UserConferenceEntity;
import com.fudan.ast.conferenceserver.entity.UserEntity;
import com.fudan.ast.conferenceserver.repository.ConferenceRepository;
import com.fudan.ast.conferenceserver.repository.UserConferenceRepository;
import com.fudan.ast.conferenceserver.repository.UserRepository;
import com.fudan.ast.conferenceserver.utils.ProtoUtils;
import com.fudan.ast.grpc.lib.Conference.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GrpcService
public class ConferenceService extends ConferenceServiceGrpc.ConferenceServiceImplBase {

    @Autowired
    private ConferenceRepository conferenceRepository; // 你需要定义并注入对应的Repository

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConferenceRepository userConferenceRepository;
    private Conference convertToProto(ConferenceEntity conferenceEntity) {
        return Conference.newBuilder()
                .setId(conferenceEntity.getId())
                .setShortName(conferenceEntity.getShort_name())
                .setFullName(conferenceEntity.getFull_name())
                .setStartDate(ProtoUtils.toTimestamp(conferenceEntity.getStart_date()))
                .setEndDate(ProtoUtils.toTimestamp(conferenceEntity.getEnd_date()))
                .setLocation(conferenceEntity.getLocation())
                .setSubmissionStartDate(ProtoUtils.toTimestamp(conferenceEntity.getSubmission_start_date()))
                .setSubmissionEndDate(ProtoUtils.toTimestamp(conferenceEntity.getSubmission_end_date()))
                .setStatus(ProtoUtils.mapStatusEntityToProto(conferenceEntity.getStatus()))
                .setChairId(conferenceEntity.getChair().getId())
                .build();
    }
    private ConferenceEntity convertToEntity(Conference conference) {
        ConferenceEntity conferenceEntity = new ConferenceEntity();

        conferenceEntity.setId(conference.getId());
        conferenceEntity.setShort_name(conference.getShortName());
        conferenceEntity.setFull_name(conference.getFullName());
        conferenceEntity.setStart_date(ProtoUtils.fromTimestamp(conference.getStartDate()));
        conferenceEntity.setEnd_date(ProtoUtils.fromTimestamp(conference.getEndDate()));
        conferenceEntity.setLocation(conference.getLocation());
        conferenceEntity.setSubmission_start_date(ProtoUtils.fromTimestamp(conference.getSubmissionStartDate()));
        conferenceEntity.setSubmission_end_date(ProtoUtils.fromTimestamp(conference.getSubmissionEndDate()));
        conferenceEntity.setStatus(ProtoUtils.mapProtoToStatusEntity(conference.getStatus()));

        // 假设 chair_id 是一个 User 实体的 ID，你需要从相应的地方获取 User 对象并设置到 ConferenceEntity 中
        UserEntity chair =userRepository.getById(conference.getChairId());
        conferenceEntity.setChair(chair);

        return conferenceEntity;
    }


    @Override
    public void createConference(CreateConferenceRequest request, StreamObserver<CreateConferenceResponse> responseObserver) {
        // 实现创建会议逻辑
        ConferenceEntity conferenceEntity=new ConferenceEntity();
        conferenceEntity.setShort_name(request.getShortName());
        conferenceEntity.setFull_name(request.getFullName());
        conferenceEntity.setStart_date(ProtoUtils.fromTimestamp(request.getStartDate()));
        conferenceEntity.setEnd_date(ProtoUtils.fromTimestamp(request.getEndDate()));
        conferenceEntity.setLocation(request.getLocation());
        conferenceEntity.setSubmission_start_date(ProtoUtils.fromTimestamp(request.getSubmissionStartDate()));
        conferenceEntity.setSubmission_end_date(ProtoUtils.fromTimestamp(request.getSubmissionEndDate()));
        conferenceEntity.setStatus(ProtoUtils.mapProtoToStatusEntity(ConferenceStatus.PREPARING));
        // 在此处你可以保存会议信息到数据库，如使用 conferenceRepository
        conferenceEntity = conferenceRepository.save(conferenceEntity);
        CreateConferenceResponse createConferenceResponse=CreateConferenceResponse.newBuilder()
                .setSuccess(true)
                .build();
        responseObserver.onNext(createConferenceResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getConference(GetConferenceRequest request, StreamObserver<Conference> responseObserver) {
        // 实现获取会议逻辑
        int conferenceId = request.getId();
        // 从数据库或其他数据源中获取会议信息
        Optional<ConferenceEntity> optionalConferenceEntity = conferenceRepository.findById(conferenceId);

        optionalConferenceEntity.ifPresent(conferenceEntity -> {
            // 使用 proto 消息构建响应
            Conference conference = convertToProto(conferenceEntity);
            responseObserver.onNext(conference);
            responseObserver.onCompleted();
        });

        if (!optionalConferenceEntity.isPresent()) {
            // 如果会议不存在，可以返回错误信息
            responseObserver.onError(Status.NOT_FOUND.withDescription("Conference not found").asRuntimeException());
        }
    }



    @Override
    public void listConferences(ListConferencesRequest request, StreamObserver<ListConferencesResponse> responseObserver) {
        // 实现列出会议逻辑，返回所有的会议信息

        // 从数据库或其他数据源中获取所有会议
        List<ConferenceEntity> conferenceEntities = conferenceRepository.findAll();

        // 将所有会议信息转换为 gRPC 消息
        List<Conference> conferences = new ArrayList<>();
        for (ConferenceEntity conferenceEntity : conferenceEntities) {
            Conference conference = convertToProto(conferenceEntity);
            conferences.add(conference);
        }

        ListConferencesResponse response = ListConferencesResponse.newBuilder()
                .addAllConferences(conferences)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void updateConference(UpdateConferenceRequest request, StreamObserver<UpdateConferenceResponse> responseObserver) {
        // 构建 Proto 对象
        Conference conferenceProto = Conference.newBuilder()
                .setId(request.getId())
                .setShortName(request.getShortName())
                .setFullName(request.getFullName())
                .setStartDate(request.getStartDate())
                .setEndDate(request.getEndDate())
                .setLocation(request.getLocation())
                .setSubmissionStartDate(request.getSubmissionStartDate())
                .setSubmissionEndDate(request.getSubmissionEndDate())
                .setStatus(request.getStatus())
                .build();

        // 转换为 ConferenceEntity
        ConferenceEntity updatedConferenceEntity = convertToEntity(conferenceProto);

        // 保存更新后的会议信息
        conferenceRepository.save(updatedConferenceEntity);

        // 构建响应
        UpdateConferenceResponse response = UpdateConferenceResponse.newBuilder()
                .setSuccess(true)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void invitePcMember(InvitePcMemberRequest request,
                               StreamObserver<InvitePcMemberResponse> responseObserver) {

        int conferenceId = request.getConferenceId();
        int userId = request.getUserId();

        // 1. 获取会议对象
        Optional<ConferenceEntity> conference = conferenceRepository.findById(conferenceId);

        // 2. 将pc成员添加到会议中


        // 3. 保存到关联表中
        UserConferenceEntity userConferenceEntity = new UserConferenceEntity();
        userConferenceEntity.setUserId(userId);
        userConferenceEntity.setConferenceId(conferenceId);
        userConferenceEntity.setRoleId(5);
        userConferenceRepository.save(userConferenceEntity);

        // 4. 构造返回
        InvitePcMemberResponse response = InvitePcMemberResponse.newBuilder()
                .setSuccess(true)
                .build();


        responseObserver.onNext(response);

        responseObserver.onCompleted();
    }

    @Override
    public void confirmPcMemberInvitation(ConfirmPcMemberInvitationRequest request, StreamObserver<ConfirmPcMemberInvitationResponse> responseObserver) {
        // Implement your logic here
        UserConferenceEntity userConferenceEntity= userConferenceRepository.findByUserIdAndConferenceId(request.getUserId(),request.getConferenceId());
        boolean success = false;
        // 如果数据库中不存在这条邀请数据，那么就直接返回
        if (userConferenceEntity == null) {
            ConfirmPcMemberInvitationResponse response = ConfirmPcMemberInvitationResponse.newBuilder()
                    .setSuccess(success)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }

        if (request.getAccept()) {
            // 如果accept为true，则更新数据库中的条目
            userConferenceEntity.setRoleId(2);
            userConferenceRepository.save(userConferenceEntity);
            success = true;
        } else {
            // 如果accept为false，则删除数据库中的条目
            userConferenceRepository.delete(userConferenceEntity);
            success = true;
        }

        ConfirmPcMemberInvitationResponse response = ConfirmPcMemberInvitationResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void confirmCreateConference(ConfirmCreateConferenceRequest request, StreamObserver<ConfirmCreateConferenceResponse> responseObserver) {
        // Implement your logic here
        ConferenceEntity conferenceEntity = conferenceRepository.findById(request.getConferenceId()).orElse(null);

        boolean success = false;
        // 如果数据库中不存在这条邀请数据，那么就直接返回
        if (conferenceEntity == null) {
            ConfirmCreateConferenceResponse response = ConfirmCreateConferenceResponse.newBuilder()
                    .setSuccess(success)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
            return;
        }
        if (request.getAccept()) {
            // 如果accept为true，则更新数据库中的条目
            conferenceEntity.setStatus(ProtoUtils.mapProtoToStatusEntity(ConferenceStatus.PREPARING));
            conferenceRepository.save(conferenceEntity);
            success = true;
        } else {
            // 如果accept为false，则删除数据库中的条目
            conferenceRepository.delete(conferenceEntity);
            success = true;
        }

        ConfirmCreateConferenceResponse response = ConfirmCreateConferenceResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void startSubmission(StartSubmissionRequest request, StreamObserver<StartSubmissionResponse> responseObserver) {
        // Implement your logic here
        ConferenceEntity conferenceEntity = conferenceRepository.findById(request.getConferenceId()).orElse(null);

        boolean success = false;
        if (conferenceEntity != null) {
            // 更新会议的时间和状态
            conferenceEntity.setStatus(ProtoUtils.mapProtoToStatusEntity(ConferenceStatus.SUBMITTING));
            conferenceRepository.save(conferenceEntity);
            success = true;
        }

        StartSubmissionResponse response = StartSubmissionResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void endSubmission(EndSubmissionRequest request, StreamObserver<EndSubmissionResponse> responseObserver) {
        // Implement your logic here
        ConferenceEntity conferenceEntity = conferenceRepository.findById(request.getConferenceId()).orElse(null);

        boolean success = false;
        if (conferenceEntity != null) {
            // 更新会议的时间和状态
            conferenceEntity.setStatus(ProtoUtils.mapProtoToStatusEntity(ConferenceStatus.REVIEWING));
            conferenceRepository.save(conferenceEntity);
            success = true;
        }

        EndSubmissionResponse response = EndSubmissionResponse.newBuilder()
                .setSuccess(success)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
