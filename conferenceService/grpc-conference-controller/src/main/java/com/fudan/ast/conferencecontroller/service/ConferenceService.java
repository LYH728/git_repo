package com.fudan.ast.conferencecontroller.service;

import com.fudan.ast.grpc.lib.Conference.*;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class ConferenceService {

    @GrpcClient("grpc-conference-server")
    private ConferenceServiceGrpc.ConferenceServiceBlockingStub conferenceServiceBlockingStub;

    public CreateConferenceResponse createConference(CreateConferenceRequest request) {
        return conferenceServiceBlockingStub.createConference(request);
    }

    public Conference getConference(GetConferenceRequest request) {
        return conferenceServiceBlockingStub.getConference(request);
    }

    public ListConferencesResponse listConferences(ListConferencesRequest request) {
        return conferenceServiceBlockingStub.listConferences(request);
    }

    public UpdateConferenceResponse updateConference(UpdateConferenceRequest request) {
        return conferenceServiceBlockingStub.updateConference(request);
    }

    public InvitePcMemberResponse invitePcMember(InvitePcMemberRequest request) {
        return conferenceServiceBlockingStub.invitePcMember(request);
    }

    public ConfirmPcMemberInvitationResponse confirmPcMemberInvitation(ConfirmPcMemberInvitationRequest request) {
        return conferenceServiceBlockingStub.confirmPcMemberInvitation(request);
    }

    public ConfirmCreateConferenceResponse confirmCreateConference(ConfirmCreateConferenceRequest request) {
        return conferenceServiceBlockingStub.confirmCreateConference(request);
    }

    public StartSubmissionResponse startSubmission(StartSubmissionRequest request) {
        return conferenceServiceBlockingStub.startSubmission(request);
    }

    public EndSubmissionResponse endSubmission(EndSubmissionRequest request) {
        return conferenceServiceBlockingStub.endSubmission(request);
    }

}