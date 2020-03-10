package com.rivulet.rivulet_oj.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface JudgeMapper {

    /**
     * @sql 通过题目id获取题目标准输入信息
     * @param topicId
     * @Author 孙旭
     * @Time 2020年3月10日13:54:48
     */
    @Select("select judge_input from judge where judge_topic_id = #{topicId}")
    String selectInputMessageByTopicId(int topicId);

    /**
     * @sql 通过题目id获取题目标准输出信息
     * @param topicId
     * @Author 孙旭
     * @Time 2020年3月10日13:54:48
     */
    @Select("select judge_output from judge where judge_topic_id = #{topicId}")
    String selectOutputMessageByTopicId(int topicId);

    @Update("update code set code_state = #{state}, code_result = #{result}, code_memory = #{memory},code_time = #{time} where code_id = #{codeId}")
    void updateCodeByCodeId(String state,String result,String memory,String time,int codeId);
}
