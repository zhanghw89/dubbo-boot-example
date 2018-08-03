package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public interface HelloService {


    @GetMapping("/hello")
    String sayHello(String name);

}