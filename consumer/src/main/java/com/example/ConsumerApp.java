package com.example;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with Intellij IDEA
 *
 * @author yanghong
 * Date: 2021/7/28
 * TIme: 16:35
 */
@SpringBootApplication
@EnableDubbo
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class, args);
    }
}
