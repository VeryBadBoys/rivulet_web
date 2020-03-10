package com.rivulet.rivulet_oj.expand.judge;

public class JudgeResult {
    private String state;
    private String result;
    private String memory;
    private String time;

    public JudgeResult(String state, String result, String memory, String time) {
        this.state = state;
        this.result = result;
        this.memory = memory;
        this.time = time;
    }

    public JudgeResult() {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
