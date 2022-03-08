package com.bianjiahao.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboSimpleConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSimpleConsumerApplication.class, args);
    }

}
