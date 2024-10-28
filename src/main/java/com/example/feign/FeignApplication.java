package com.example.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.CountDownLatch;

@SpringBootApplication
@EnableFeignClients(defaultConfiguration = DefaultConfig.class)
public class FeignApplication {

    public static void main(String[] args) throws InterruptedException {
        final ConfigurableApplicationContext run = SpringApplication.run(FeignApplication.class, args);
        final IDemo bean = run.getBean(IDemo.class);
        CountDownLatch latch = new CountDownLatch(1);
        latch.await();
    }

}
