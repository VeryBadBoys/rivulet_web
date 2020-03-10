package com.rivulet.rivulet_oj;

import com.alibaba.fastjson.JSONObject;
import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.command.CreateContainerResponse;
import com.github.dockerjava.api.model.ExposedPort;
import com.github.dockerjava.api.model.Info;
import com.github.dockerjava.api.model.Ports;
import com.github.dockerjava.core.DockerClientBuilder;

import static com.github.dockerjava.api.model.HostConfig.newHostConfig;

public class Test {

    public static DockerClient connectDocker(){
        DockerClient dockerClient = DockerClientBuilder.getInstance("tcp://106.54.51.67:2375").build();
        Info info = dockerClient.infoCmd().exec();
        String infoStr = JSONObject.toJSONString(info);
        System.out.println("docker的环境信息如下：=================");
        System.out.println(info);
        return dockerClient;
    }

    public static void main(String[] args) {
        DockerClient dockerClient = connectDocker();
    }


}
