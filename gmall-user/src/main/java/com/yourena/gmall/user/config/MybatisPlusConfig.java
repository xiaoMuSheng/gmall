package com.yourena.gmall.user.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.yourena.gmail.user.mapper")
public class MybatisPlusConfig {

}
