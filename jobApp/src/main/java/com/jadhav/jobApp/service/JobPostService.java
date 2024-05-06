package com.jadhav.jobApp.service;

import com.jadhav.jobApp.model.JobPost;
import com.jadhav.jobApp.repo.JobPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPostService {
    @Autowired
    JobPostRepo jobPostRepo;
    public List<JobPost> getAllJobs(){
        return jobPostRepo.getAllJobs();
    }

    public void addJobPost(JobPost jobPost) {
        jobPostRepo.addJobPost(jobPost);
    }

    public JobPost getJobPostById(int jobPostId) {
        return jobPostRepo.getJobPostById(jobPostId);
    }

    public JobPost updateJobPost(JobPost jobPost) {
        return jobPostRepo.updateJobPost(jobPost);
    }

    public void deleteJobPost(int jobPostId) {
        jobPostRepo.deleteJobPost(jobPostId);
    }
}
