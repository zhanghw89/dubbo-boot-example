package com.example.demoprovider;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProviderApplication {


	public static void main(String[] args) {
		// start embedded zookeeper server
//		new EmbeddedZooKeeper(2181, false).start();
		SpringApplication.run(DemoProviderApplication.class, args);
		while (true){
			try {
				Thread.sleep(200);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
