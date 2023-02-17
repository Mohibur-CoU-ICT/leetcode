package com.mohibur.problem_solving.controller;

import com.mohibur.common.interfaces.UrlConstant;
import com.mohibur.problem_solving.serviceImpl.SubmissionServiceImpl;
import com.mohibur.problem_solving.entity.Submission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstant.SubmissionUrl.ROOT)
public class SubmissionController {
    @Autowired
    private SubmissionServiceImpl submissionService;

    @PostMapping
    public ResponseEntity<Submission> createSubmission(@RequestBody Submission submission) {
        return submissionService.createSubmission(submission);
    }

    @GetMapping(UrlConstant.ID)
    public ResponseEntity<Submission> getSubmission(@PathVariable Long id) {
        return submissionService.getSubmissionById(id);
    }

    @GetMapping
    public ResponseEntity<List<Submission>> getAllSubmissions() {
        return submissionService.getAllSubmissions();
    }

    @PutMapping
    public ResponseEntity<Submission> updateSubmission(@RequestBody Submission submission) {
        return submissionService.updateSubmission(submission);
    }

    @DeleteMapping(UrlConstant.ID)
    public ResponseEntity<?> deleteSubmission(@PathVariable Long id) {
        return submissionService.deleteSubmission(id);
    }
}
