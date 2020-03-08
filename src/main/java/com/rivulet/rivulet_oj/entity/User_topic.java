package com.rivulet.rivulet_oj.entity;

import java.util.Date;

public class User_topic {
    private int ut_topic_id;
    private String ut_onload_count;
    private Date ut_time;
    private int ut_user_id;

    public User_topic() {
    }

    public User_topic(int ut_topic_id, String ut_onload_count, Date ut_time, int ut_user_id) {
        this.ut_topic_id = ut_topic_id;
        this.ut_onload_count = ut_onload_count;
        this.ut_time = ut_time;
        this.ut_user_id = ut_user_id;
    }

    public int getUt_topic_id() {
        return ut_topic_id;
    }

    public void setUt_topic_id(int ut_topic_id) {
        this.ut_topic_id = ut_topic_id;
    }

    public String getUt_onload_count() {
        return ut_onload_count;
    }

    public void setUt_onload_count(String ut_onload_count) {
        this.ut_onload_count = ut_onload_count;
    }

    public Date getUt_time() {
        return ut_time;
    }

    public void setUt_time(Date ut_time) {
        this.ut_time = ut_time;
    }

    public int getUt_user_id() {
        return ut_user_id;
    }

    public void setUt_user_id(int ut_user_id) {
        this.ut_user_id = ut_user_id;
    }
}
