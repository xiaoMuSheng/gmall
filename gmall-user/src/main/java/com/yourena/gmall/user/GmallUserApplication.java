package com.yourena.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
//@MapperScan(basePackages = "com.yourena.gmall.user.mapper")
public class GmallUserApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserApplication.class, args);
    }
}
