package com.rivulet.rivulet_oj.entity;


public class Code {
    private int code_id;
    private int code_user_id;
    private int code_topic_id;
    private String code_state;
    private String code_result;
    private String code_memory;
    private String code_lang;
    private String code_length;
    private String code_stdout;
    private String code_answer;
    private String code_details;

    public Code() {
    }

    public Code(int code_id, int code_user_id, int code_topic_id, String code_state, String code_result, String code_memory, String code_lang, String code_length, String code_stdout, String code_answer, String code_details) {
        this.code_id = code_id;
        this.code_user_id = code_user_id;
        this.code_topic_id = code_topic_id;
        this.code_state = code_state;
        this.code_result = code_result;
        this.code_memory = code_memory;
        this.code_lang = code_lang;
        this.code_length = code_length;
        this.code_stdout = code_stdout;
        this.code_answer = code_answer;
        this.code_details = code_details;
    }

    public int getCode_id() {
        return code_id;
    }

    public void setCode_id(int code_id) {
        this.code_id = code_id;
    }

    public int getCode_user_id() {
        return code_user_id;
    }

    public void setCode_user_id(int code_user_id) {
        this.code_user_id = code_user_id;
    }

    public int getCode_topic_id() {
        return code_topic_id;
    }

    public void setCode_topic_id(int code_topic_id) {
        this.code_topic_id = code_topic_id;
    }

    public String getCode_state() {
        return code_state;
    }

    public void setCode_state(String code_state) {
        this.code_state = code_state;
    }

    public String getCode_result() {
        return code_result;
    }

    public void setCode_result(String code_result) {
        this.code_result = code_result;
    }

    public String getCode_memory() {
        return code_memory;
    }

    public void setCode_memory(String code_memory) {
        this.code_memory = code_memory;
    }

    public String getCode_lang() {
        return code_lang;
    }

    public void setCode_lang(String code_lang) {
        this.code_lang = code_lang;
    }

    public String getCode_length() {
        return code_length;
    }

    public void setCode_length(String code_length) {
        this.code_length = code_length;
    }

    public String getCode_stdout() {
        return code_stdout;
    }

    public void setCode_stdout(String code_stdout) {
        this.code_stdout = code_stdout;
    }

    public String getCode_answer() {
        return code_answer;
    }

    public void setCode_answer(String code_answer) {
        this.code_answer = code_answer;
    }

    public String getCode_details() {
        return code_details;
    }

    public void setCode_details(String code_details) {
        this.code_details = code_details;
    }
}
