
package com.fudan.ast.grpcpapercontroller.controller;

import com.fudan.ast.grpc.lib.CreateSubmissionRequest;
import com.fudan.ast.grpc.lib.CreateSubmissionResponse;
import com.fudan.ast.grpcpapercontroller.service.SubmissionService;
import com.google.protobuf.ByteString;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import com.fudan.ast.grpcpapercontroller.util.RandomIDBuilder;
import java.util.UUID;

// ...


        import org.springframework.util.StringUtils;

// ...
        import java.util.UUID;


@Controller
@RequestMapping("submission")
public class SubmissionController {

    private final SubmissionService submissionService;

    public SubmissionController(SubmissionService submissionService) {
        this.submissionService = submissionService;
    }

    @PostMapping(value = "/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public ResponseEntity<CreateSubmissionResponse> createSubmission(@RequestParam("conferenceId") int conferenceId,
                                                                     @RequestParam("title") String title,
                                                                     @RequestParam("abstractText") String abstractText,
                                                                     @RequestParam("submitterId") int submitterId,
                                                                     @RequestParam("paper_file_path") String paperFilePath,
                                                                     @RequestParam("file") MultipartFile file) {

        // Check if a file is provided
        System.out.println("收到请求");
        if (file == null || file.isEmpty()) {
            System.out.println("文件为空");
            return ResponseEntity.badRequest().build();
        }

        // Generate a unique filename for the uploaded file
        String originalFilename = StringUtils.cleanPath(file.getOriginalFilename());
        String uniqueFileName = UUID.randomUUID() + "_" + originalFilename;

        // Save the file to a specific location on the server
        try {

            String filePath = "D:/git_repos/paperService/testPaperAPI/"+uniqueFileName;
            file.transferTo(new File(filePath));


        } catch (IOException e) {
            // Handle file saving error
            System.out.println("文件保存出错");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

        // Create a CreateSubmissionRequest with the extracted data
        CreateSubmissionRequest request = CreateSubmissionRequest.newBuilder()
                .setConferenceId(conferenceId)
                .setTitle(title)
                .setAbstract(abstractText)
                .setSubmitterId(submitterId)
                .setPaperFilePath(paperFilePath)
                .build();

        // Call the submissionService to create the submission
        CreateSubmissionResponse response = submissionService.createSubmission(request);

        // Return the response
        return ResponseEntity.ok(response);
    }
}