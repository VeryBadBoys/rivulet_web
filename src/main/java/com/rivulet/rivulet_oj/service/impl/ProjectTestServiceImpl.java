package com.rivulet.rivulet_oj.service.impl;

import com.rivulet.rivulet_oj.mapper.ProjectTestMapper;
import com.rivulet.rivulet_oj.service.ProjectTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTestServiceImpl implements ProjectTestService {

    @Autowired
    ProjectTestMapper projectTestMapper;

    @Override
    public String test() {
        return "test success";
    }
}
