//package com.fudan.ast.grpcpaperserver.service;
//import com.fudan.ast.grpc.lib.CreateSubmissionRequest;
//import com.fudan.ast.grpc.lib.CreateSubmissionResponse;
//import com.fudan.ast.grpc.lib.SubmissionServiceGrpc;
//import com.fudan.ast.grpcpaperserver.entity.Submission;
//import com.fudan.ast.grpcpaperserver.repository.SubmissionRepository;
//import io.grpc.stub.StreamObserver;
//import net.devh.boot.grpc.server.service.GrpcService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//@GrpcService
//public class SubmissionService extends SubmissionServiceGrpc.SubmissionServiceImplBase {
//
//    @Autowired
//    private SubmissionRepository submissionRepository;
//
//    @Override
//    public void createSubmission(CreateSubmissionRequest request, StreamObserver<CreateSubmissionResponse> responseObserver) {
//        // Extract submission details from the request
//        int conferenceId = request.getConferenceId();
//        String title = request.getTitle();
//        String abstractText = request.getAbstract();
//        int submitterId = request.getSubmitterId();
//        String pdfFile = request.getPaperFilePath();
//        String status = request.getStatus();
//
//        // Create a new Submission entity
//        Submission submission = new Submission();
//        submission.setConferenceId(conferenceId);
//        submission.setTitle(title);
//        submission.setAbstractText(abstractText);
//        submission.setSubmitterId(submitterId);
//        submission.setPaperFilePath(pdfFile);
//        submission.setStatus(status);
//
//        // Save the Submission entity to the repository
//        submissionRepository.save(submission);
//
//        // Build the response
//        CreateSubmissionResponse response = CreateSubmissionResponse.newBuilder()
//                .setStatus(true) // Set the appropriate status based on the creation result
//                .build();
//
//        // Send the response
//        responseObserver.onNext(response);
//        responseObserver.onCompleted();
//    }
//}
package com.fudan.ast.grpcpaperserver.service;

import com.fudan.ast.grpc.lib.CreateSubmissionRequest;
import com.fudan.ast.grpc.lib.CreateSubmissionResponse;
import com.fudan.ast.grpc.lib.SubmissionServiceGrpc;
import com.fudan.ast.grpcpaperserver.entity.Submission;
import com.fudan.ast.grpcpaperserver.repository.SubmissionRepository;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class SubmissionService extends SubmissionServiceGrpc.SubmissionServiceImplBase {

    @Autowired
    private SubmissionRepository submissionRepository;

    @Override
    public void createSubmission(CreateSubmissionRequest request, StreamObserver<CreateSubmissionResponse> responseObserver) {
        // Extract submission details from the request
        int conferenceId = request.getConferenceId();
        String title = request.getTitle();
        String abstractText = request.getAbstract();
        int submitterId = request.getSubmitterId();
        String pdfFile = request.getPaperFilePath();
        String status = request.getStatus();

        // Create a new Submission entity
        Submission submission = new Submission();
        submission.setConferenceId(conferenceId);
        submission.setTitle(title);
        submission.setAbstractText(abstractText);
        submission.setSubmitterId(submitterId);
        submission.setPaper_file_path(pdfFile);
        submission.setStatus(status);

        // Save the submission entity to the database
        Submission savedSubmission = submissionRepository.save(submission);

        // Create the response
        CreateSubmissionResponse response = CreateSubmissionResponse.newBuilder()
                .setStatus(savedSubmission != null)
                .build();

        // Send the response
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}