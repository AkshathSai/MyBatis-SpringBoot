package com.example.demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyBatisSpringBootApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MyBatisSpringBootApplication.class, args);
	}

}
