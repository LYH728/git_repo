package com.fudan.ast.grpcpapercontroller.service;

import com.fudan.ast.grpc.lib.CreateSubmissionRequest;
import com.fudan.ast.grpc.lib.CreateSubmissionResponse;
import com.fudan.ast.grpc.lib.SubmissionServiceGrpc;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SubmissionService {

    @GrpcClient("grpc-paper-server")
    private SubmissionServiceGrpc.SubmissionServiceBlockingStub stub;

    public CreateSubmissionResponse createSubmission(CreateSubmissionRequest request) {
        CreateSubmissionResponse response;
        try {
            response = stub.createSubmission(request);
        } catch (StatusRuntimeException e) {
            // Handle specific gRPC status exceptions
            if (e.getStatus().getCode() == Status.Code.NOT_FOUND) {
                // Handle not found error
                System.out.println("Submission service not found.");
            } else if (e.getStatus().getCode() == Status.Code.INVALID_ARGUMENT) {
                // Handle invalid argument error
                System.out.println("Invalid submission request.");
            } else {
                // Handle other exceptions
                System.out.println("Error occurred in submission service.");
            }

            // Return an error response
            return CreateSubmissionResponse.newBuilder()
                    .setStatus(false)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            // Handle other exceptions
            return CreateSubmissionResponse.newBuilder()
                    .setStatus(false)
                    .build();
        }

        return response;
    }
}