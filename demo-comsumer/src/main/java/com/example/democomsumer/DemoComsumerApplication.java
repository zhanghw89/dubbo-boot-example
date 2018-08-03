package com.example.democomsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class DemoComsumerApplication {

    @Reference(version = "1.0.0")
    private HelloService demoService;

    public static void main(String[] args) {
        SpringApplication.run(DemoComsumerApplication.class, args);
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @PostConstruct
    public void init() {

        int i = 0;
        while (true) {
            try {
                i++;
                Thread.sleep(1000);
                String sayHello = demoService.sayHello("world" + i);
                System.err.println(sayHello);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
