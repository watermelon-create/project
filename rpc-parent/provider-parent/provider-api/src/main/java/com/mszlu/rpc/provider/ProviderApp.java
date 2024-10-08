package com.mszlu.rpc.provider;

import com.mszlu.rpc.annotation.EnableRpc;
import com.mszlu.rpc.annotation.MsService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRpc(nacosGroup = "ms-rpc",serverPort = 13568)
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class,args);
    }
}
