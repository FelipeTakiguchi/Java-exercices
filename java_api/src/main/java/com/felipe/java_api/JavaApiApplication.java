package com.felipe.java_api;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaApiApplication.class, args);
		Exercicio5 ex = new Exercicio5();
		ex.Execute();		
	}

}
