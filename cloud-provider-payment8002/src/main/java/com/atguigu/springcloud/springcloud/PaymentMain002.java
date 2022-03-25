package com.atguigu.springcloud.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @auther jin
 * @create 2022 03 2022/3/23 15:18
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain002.class,args);
    }
}
