package com.accp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.accp.dao")
public class ExampleJava33SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleJava33SpringbootApplication.class, args);
	}

}
