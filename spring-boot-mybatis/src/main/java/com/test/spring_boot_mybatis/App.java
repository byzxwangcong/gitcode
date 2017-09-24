package com.test.spring_boot_mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot启动类.
 */
@SpringBootApplication
@MapperScan("com.test.*")//扫描：该包下相应的class,主要是MyBatis的持久化类.
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
