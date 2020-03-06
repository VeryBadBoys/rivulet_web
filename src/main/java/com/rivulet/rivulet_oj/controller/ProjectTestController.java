package com.rivulet.rivulet_oj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class ProjectTestController {

    @GetMapping
    public String test(){
        return "test success";
    }
}
