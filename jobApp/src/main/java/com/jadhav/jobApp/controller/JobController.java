package com.jadhav.jobApp.controller;

import com.jadhav.jobApp.model.JobPost;
import com.jadhav.jobApp.service.JobPostService;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobController {

    @Autowired
    JobPostService jobPostService;

    @GetMapping({"/","home"})
    public String home(){
        return "Welcome to apana jobPortal";
    }

    @GetMapping("/getAllJobs")
    public List<JobPost> getAllJobs(){
        return jobPostService.getAllJobs();
    }

    @PostMapping("/addJobPost")
    public int addJobPost(@RequestBody JobPost jobPost){
        jobPostService.addJobPost(jobPost);
        return jobPostService.getJobPostById(jobPost.getId()).getId();
    }

    @GetMapping("/getJobPost/{id}")
    public JobPost getJobPost(@PathVariable("id") int jobPostId){
        return jobPostService.getJobPostById(jobPostId);
    }

    @PutMapping("/updateJobPost")
    public JobPost updateJobPost(@RequestBody JobPost jobPost){
        return jobPostService.updateJobPost(jobPost);
    }

    @DeleteMapping("/deleteJobPost/{id}")
    public String deleteJobPost(@PathVariable("id") int jobPostId){
        jobPostService.deleteJobPost(jobPostId);
        return "sucess";
    }

}
