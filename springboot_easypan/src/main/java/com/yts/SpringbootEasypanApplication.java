package com.yts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//事务生效
@EnableTransactionManagement
//定时任务
@EnableScheduling
//异步调用
@EnableAsync
public class SpringbootEasypanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEasypanApplication.class, args);
    }

}
