package com.rivulet.rivulet_oj.expand.judge;


import com.rivulet.rivulet_oj.mapper.JudgeMapper;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.ArrayList;
import java.util.Arrays;

public class JudgeMgr  {

    public static JudgeMgr _instance = new JudgeMgr();
    private JudgeSys judgeSys;

    @Autowired
    private JudgeMapper judgeMapper;

    private String code;
    private ArrayList<String> output;
    private ArrayList<String> input;



    public static JudgeMgr getInstance(){
        return _instance;
    }

    private JudgeMgr(){
        judgeSys = new JudgeSys();
    }


    public void message(int topicId,int codeId,String code,String lang){
        String inputString = judgeMapper.selectInputMessageByTopicId(topicId);
        input = new ArrayList<String>(Arrays.asList(inputString.split("\r\n")));
        String outputString = judgeMapper.selectInputMessageByTopicId(topicId);
        output = new ArrayList<String>(Arrays.asList(outputString.split("\r\n")));
        JudgeResult result = judgeSys.getAns(code,lang,input,output);
        judgeMapper.updateCodeByCodeId(result.getState(),result.getResult(),result.getMemory(),result.getTime(),codeId);
    }
}
