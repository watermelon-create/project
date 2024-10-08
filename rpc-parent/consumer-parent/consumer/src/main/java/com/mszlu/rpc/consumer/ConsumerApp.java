package com.mszlu.rpc.consumer;

import com.mszlu.rpc.annotation.EnableRpc;
import com.mszlu.rpc.annotation.MsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRpc(nacosGroup ="ms-rpc",loadBalance = "roundRobin")
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}
