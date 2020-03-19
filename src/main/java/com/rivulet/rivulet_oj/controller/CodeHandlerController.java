package com.rivulet.rivulet_oj.controller;

import com.rivulet.rivulet_oj.entity.Response;
import com.rivulet.rivulet_oj.service.CodeHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/core")
public class CodeHandlerController {

    @Autowired
    private CodeHandlerService codeHandlerService;

    /**
     * @apiNote 查询所有题目(简略)
     * @param user_id
     * @return
     */
    @GetMapping("/topics/{user_id}")
    public Response searchTopics(@PathVariable("user_id") int user_id)
    {
        return codeHandlerService.searchTopics(user_id);
    }


    /**
     * 查询指定题目 (topic_id)
     * @param topic_id
     * @return
     */
    @GetMapping("/topic/{topic_id}")
    public Response searchTopic(@PathVariable("topic_id") int topic_id)
    {
        return codeHandlerService.searchTopic(topic_id);
    }


    /**
     * @apiNote 存储代码以及提交记录
     * @param user_id
     * @param topic_id
     * @param code
     * @return
     */
    @PostMapping("/code")
    public Response addCode(@RequestParam("user_id") int user_id,
                       @RequestParam("topic_id") int topic_id,
                       @RequestParam("code") String code)
    {
        return codeHandlerService.submitCode(user_id,topic_id,code);
    }


    /**
     * @apiNote 查询代码评判结果
     * @param code_id
     * @return
     */
    @GetMapping("/code/{code_id}")
    public Response searchJudge(@PathVariable("code_id") int code_id)
    {
        return codeHandlerService.searchJudge(code_id);
    }

}
