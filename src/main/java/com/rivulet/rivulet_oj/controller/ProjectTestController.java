package com.rivulet.rivulet_oj.controller;

import com.rivulet.rivulet_oj.service.ProjectTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ProjectTestController {

    @Autowired
    ProjectTestService projectTestService;

    @GetMapping
    public String test(){
        return projectTestService.test();
    }
}
