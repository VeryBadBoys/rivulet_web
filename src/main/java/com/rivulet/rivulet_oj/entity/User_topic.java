package com.rivulet.rivulet_oj.entity;

import java.util.Date;

public class User_topic {
    private int ut_topic_id;
    private Date ut_time;
    private int ut_user_id;

    public User_topic() {
    }

    public User_topic(int ut_topic_id, Date ut_time, int ut_user_id) {
        this.ut_topic_id = ut_topic_id;
        this.ut_time = ut_time;
        this.ut_user_id = ut_user_id;
    }

    public int getUt_topic_id() {
        return ut_topic_id;
    }

    public void setUt_topic_id(int ut_topic_id) {
        this.ut_topic_id = ut_topic_id;
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
