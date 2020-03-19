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
    public Response searchTopics(int user_id) {
        Response response = new Response();
        Topic[] result = codeHandlerMapper.searchTopics();
        Map<String,Object> [] returnResult = new Map[result.length];
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
            for (int i=0;i<result.length;i++)
            {
                returnResult[i] = new HashMap<>();
                returnResult[i].put("topic_id",result[i].getTopic_id());
                returnResult[i].put("topic_title",result[i].getTopic_title());
                returnResult[i].put("topic_tag",result[i].getTopic_tag());
                returnResult[i].put("topic_difficulty",result[i].getTopic_difficulty());
                returnResult[i].put("pass_count",result[i].getTopic_pass_count());
                returnResult[i].put("onload_count",result[i].getTopic_onload_count());
            }
            response.setResult(returnResult);
        }
        return response;
    }

    /**
     * 查询指定题目(根据Topic_id查询)
     * @param topic_id
     * @return
     */
    @Override
    public Response searchTopic(int topic_id) {
        Response response = new Response();
        Topic result = codeHandlerMapper.searchTopic(topic_id);
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
