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
     * @apiNote 查询题目
     * @param user_id
     * @return
     */
    @GetMapping("/topic/{user_id}")
    public Response searchTopic(@PathVariable("user_id") int user_id)
    {
        return codeHandlerService.searchTopic(user_id);
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
