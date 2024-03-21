package com.fudan.ast.conferencecontroller.controller;


import com.fudan.ast.conferencecontroller.aop.CheckPermission;
import com.fudan.ast.conferencecontroller.pojo.ConferenceResponseDO;
import com.fudan.ast.conferencecontroller.service.ConferenceService;
import com.fudan.ast.conferencecontroller.utils.ProtoUtils;
import com.fudan.ast.grpc.lib.Conference.*;
import com.fudan.ast.grpc.lib.JwtToken;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

    @PostMapping("/create")
    @CheckPermission("ROLE_USER")
    public CreateConferenceResponse createConference(@RequestBody CreateConferenceRequest request) {
        return conferenceService.createConference(request);

    }


    @PostMapping("/admin/confirm")
    @CheckPermission("ROLE_USER")
    public ResponseEntity<?> confirmPcMemberInvitation(ConfirmPcMemberInvitationRequest request) {
        conferenceService.confirmPcMemberInvitation(request);
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/{id}")
    @CheckPermission("ROLE_USER")
    public ConferenceResponseDO getConference(@PathVariable("id") int id) throws InvalidProtocolBufferException {

        GetConferenceRequest request = GetConferenceRequest.newBuilder()
                .setId(id)
                .build();
        Conference conference=conferenceService.getConference(request);
        return ProtoUtils.fromConference(conference);
    }

    @GetMapping("/all")
    @CheckPermission("ROLE_ADMIN")
    public List<ConferenceResponseDO> listConferences() {

        List<Conference> conferencesList = conferenceService.listConferences(ListConferencesRequest.newBuilder().build()).getConferencesList();
        List<ConferenceResponseDO> response= new ArrayList<>();
        for(Conference conference : conferencesList){
            response.add(ProtoUtils.fromConference(conference));
        }

        return response;
    }

    // 其他方法类似实现

    @PutMapping("/update")
    @CheckPermission("ROLE_USER")
    public ResponseEntity<?> UpdateConference(@RequestBody UpdateConferenceRequest request){
        UpdateConferenceResponse updateConferenceResponse=conferenceService.updateConference(request);
        if(updateConferenceResponse.getSuccess()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
    }


}