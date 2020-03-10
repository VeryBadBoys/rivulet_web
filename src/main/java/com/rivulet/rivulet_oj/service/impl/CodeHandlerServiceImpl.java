package com.rivulet.rivulet_oj.service.impl;

import com.rivulet.rivulet_oj.entity.Code;
import com.rivulet.rivulet_oj.entity.Topic;
import com.rivulet.rivulet_oj.entity.UserTopic;
import com.rivulet.rivulet_oj.mapper.CodeHandlerMapper;
import com.rivulet.rivulet_oj.service.CodeHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class CodeHandlerServiceImpl implements CodeHandlerService {

    @Autowired
    CodeHandlerMapper codeHandlerMapper;

    @Override
    public String test() {
        return "test success";
    }

    /**
     * @implNote 查询题库中所有题目
     * @implNote 后期可能会查询用户是否存在，存在便提供题目
     * @param user_id
     * @return
     */
    @Override
    public Topic[] searchTopic(int user_id) {
        return codeHandlerMapper.searchTopic();
    }

    /**
     * @implNote 提交代码
     * @param user_id
     * @param topic_id
     * @param code
     * @return
     */
    @Override
    public Map<String, Object> submitCode(int user_id, int topic_id, String code) {

        //添加提交记录
        UserTopic user_topic = new UserTopic();
        user_topic.setUt_user_id(user_id);
        user_topic.setUt_topic_id(topic_id);
        user_topic.setUt_time(new Date());
        codeHandlerMapper.addSubmit(user_topic);

        //添加代码
        Code addcode = new Code();
        addcode.setCode_user_id(user_id);
        addcode.setCode_topic_id(topic_id);
        addcode.setCode_details(code);
        addcode.setCode_state("0");
        codeHandlerMapper.addCode(addcode);
        //后期注意通知判题逻辑

        Map<String,Object> map = new HashMap<>();
        map.put("code",200);
        map.put("msg","success");
        map.put("data",addcode.getCode_id());
        return map;
    }

    /**
     * 查询代码评判结果
     *
     * @param code_id
     * @return
     */
    @Override
    public Code searchJudge(int code_id) {
        return codeHandlerMapper.searchCode(code_id);
    }

}
