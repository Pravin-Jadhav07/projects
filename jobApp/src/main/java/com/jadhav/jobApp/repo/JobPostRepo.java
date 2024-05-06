package com.jadhav.jobApp.repo;

import com.jadhav.jobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class JobPostRepo {

    List<JobPost> jobPostList = new ArrayList<>(){{
        add( new JobPost (1, "Java Dev", "java dev desc", 5, List.of("Java", "Spring", "Hibernate")));
        add( new JobPost(2, "Python Dev", "Python dev desc", 3, List.of("Python", "Django")));
        add(new JobPost(3, "React Dev", "React dev Desc", 7, List.of("JavaScript", "React", "Node.js")));
        add(new JobPost(4, ".Net dev", ".Net dev", 4, List.of("C#", ".NET")));
    }};
    public List<JobPost> getAllJobs() {
        return jobPostList;
    }

    public void addJobPost(JobPost jobPost) {
        jobPostList.add(jobPost);
    }

    public JobPost getJobPostById(int jobPostId) {
        for (JobPost jobPost : jobPostList) {
            if (jobPost.getId() == jobPostId) {
                return jobPost;
            }
        }
        return null;

//        JobPost jobPost = (JobPost) jobPostList.stream().filter(jb -> jb.getId() == jobPostId )
//                .findFirst()
//                .orElse(null);;
//        return jobPost;
    }

    public JobPost updateJobPost(JobPost jobPost) {

        for (JobPost jobPost1 : jobPostList) {
            if (jobPost1.getId() == jobPost.getId()) {
                jobPost1.setProfile(jobPost.getProfile());
                jobPost1.setDescription(jobPost.getDescription());
                jobPost1.setTechStack(jobPost.getTechStack());
            }
        }
        return getJobPostById(jobPost.getId());
    }

    public void deleteJobPost(int jobPostId) {
        jobPostList.removeIf(jobPost -> jobPost.getId() == jobPostId);
    }
}
