package com.example;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import org.springframework.context.annotation.Bean;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {


    @Bean
	@Override
    public String sayHello(String name) {
        String traceId = (String)RpcContext.getContext().getAttachment("traceId");
        System.err.println("traceId:"+traceId);
        return "Hello, " + name + ", " + new Date();
    }

}