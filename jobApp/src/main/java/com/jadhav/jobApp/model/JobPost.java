package com.jadhav.jobApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data   /* generate setters and getters */
@NoArgsConstructor
@AllArgsConstructor
@Component
public class JobPost {

    private int id;
    private String  profile;
    private String description;
    private int experience;
    private List<String> techStack;

}
