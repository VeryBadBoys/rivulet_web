package com.rivulet.rivulet_oj.service.impl;

import com.rivulet.rivulet_oj.entity.Code;
import com.rivulet.rivulet_oj.entity.Response;
import com.rivulet.rivulet_oj.entity.Topic;
import com.rivulet.rivulet_oj.entity.UserTopic;
import com.rivulet.rivulet_oj.mapper.CodeHandlerMapper;
import com.rivulet.rivulet_oj.service.CodeHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

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
    public Response searchTopic(int user_id) {
        Response response = new Response();
        Topic[] result = codeHandlerMapper.searchTopic();
        if (result==null)
        {
            response.setCode(404);
            response.setMessage("error");
            response.setResult(null);
        }
        else
        {
            response.setCode(200);
            response.setMessage("success");
            response.setResult(result);
        }
        return response;
    }

    /**
     * @implNote 提交代码
     * @param user_id
     * @param topic_id
     * @param code
     * @return
     */
    @Override
    public Response submitCode(int user_id, int topic_id, String code) {
        Response response = new Response();
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

        if (addcode.getCode_id()==0)
        {
            response.setCode(404);
            response.setMessage("error");
            response.setResult(null);
        }
        else
        {
            response.setCode(200);
            response.setMessage("success");
            response.setResult(addcode.getCode_id());
        }
        return response;
    }

    /**
     * 查询代码评判结果
     *
     * @param code_id
     * @return
     */
    @Override
    public Response searchJudge(int code_id) {
        Response response = new Response();
        Code result = codeHandlerMapper.searchCode(code_id);
        if (result==null)
        {
            response.setCode(404);
            response.setMessage("error");
            response.setResult(null);
        }
        else
        {
            response.setCode(200);
            response.setMessage("success");
            response.setResult(result);
        }
        return response;
    }

}
