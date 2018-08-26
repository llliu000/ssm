package com.liuguoquan.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.liuguoquan.ssm.mapper")
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}
