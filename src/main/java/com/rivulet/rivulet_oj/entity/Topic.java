package com.rivulet.rivulet_oj.entity;

import java.util.Date;

public class Topic {
    private int topic_id;
    private String topic_title;
    private String topic_tag;
    private String topic_details;
    private String topic_input;
    private String topic_output;
    private String topic_sample_input;
    private String topic_sample_output;
    private String topic_reminder;
    private String topic_limit_time;
    private String topic_limit_memory;
    private String topic_difficulty;
    private int topic_pass_count;
    private int topic_onload_count;

    public Topic() {
    }

    public Topic(int topic_id, String topic_title, String topic_tag, String topic_details, String topic_input, String topic_output, String topic_sample_input, String topic_sample_output, String topic_reminder, String topic_limit_time, String topic_limit_memory, String topic_difficulty, int topic_pass_count, int topic_onload_count) {
        this.topic_id = topic_id;
        this.topic_title = topic_title;
        this.topic_tag = topic_tag;
        this.topic_details = topic_details;
        this.topic_input = topic_input;
        this.topic_output = topic_output;
        this.topic_sample_input = topic_sample_input;
        this.topic_sample_output = topic_sample_output;
        this.topic_reminder = topic_reminder;
        this.topic_limit_time = topic_limit_time;
        this.topic_limit_memory = topic_limit_memory;
        this.topic_difficulty = topic_difficulty;
        this.topic_pass_count = topic_pass_count;
        this.topic_onload_count = topic_onload_count;
    }

    public int getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(int topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_title() {
        return topic_title;
    }

    public void setTopic_title(String topic_title) {
        this.topic_title = topic_title;
    }

    public String getTopic_tag() {
        return topic_tag;
    }

    public void setTopic_tag(String topic_tag) {
        this.topic_tag = topic_tag;
    }

    public String getTopic_details() {
        return topic_details;
    }

    public void setTopic_details(String topic_details) {
        this.topic_details = topic_details;
    }

    public String getTopic_input() {
        return topic_input;
    }

    public void setTopic_input(String topic_input) {
        this.topic_input = topic_input;
    }

    public String getTopic_output() {
        return topic_output;
    }

    public void setTopic_output(String topic_output) {
        this.topic_output = topic_output;
    }

    public String getTopic_sample_input() {
        return topic_sample_input;
    }

    public void setTopic_sample_input(String topic_sample_input) {
        this.topic_sample_input = topic_sample_input;
    }

    public String getTopic_sample_output() {
        return topic_sample_output;
    }

    public void setTopic_sample_output(String topic_sample_output) {
        this.topic_sample_output = topic_sample_output;
    }

    public String getTopic_reminder() {
        return topic_reminder;
    }

    public void setTopic_reminder(String topic_reminder) {
        this.topic_reminder = topic_reminder;
    }

    public String getTopic_limit_time() {
        return topic_limit_time;
    }

    public void setTopic_limit_time(String topic_limit_time) {
        this.topic_limit_time = topic_limit_time;
    }

    public String getTopic_limit_memory() {
        return topic_limit_memory;
    }

    public void setTopic_limit_memory(String topic_limit_memory) {
        this.topic_limit_memory = topic_limit_memory;
    }

    public String getTopic_difficulty() {
        return topic_difficulty;
    }

    public void setTopic_difficulty(String topic_difficulty) {
        this.topic_difficulty = topic_difficulty;
    }

    public int getTopic_pass_count() {
        return topic_pass_count;
    }

    public void setTopic_pass_count(int topic_pass_count) {
        this.topic_pass_count = topic_pass_count;
    }

    public int getTopic_onload_count() {
        return topic_onload_count;
    }

    public void setTopic_onload_count(int topic_onload_count) {
        this.topic_onload_count = topic_onload_count;
    }
}
