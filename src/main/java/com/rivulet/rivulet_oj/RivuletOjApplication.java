package com.rivulet.rivulet_oj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rivulet.rivulet_oj.mapper")
public class RivuletOjApplication {

    public static void main(String[] args) {
        SpringApplication.run(RivuletOjApplication.class, args);
    }

}
