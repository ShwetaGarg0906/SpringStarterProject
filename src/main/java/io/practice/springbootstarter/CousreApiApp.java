package io.practice.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CousreApiApp {
	public static void main(String[] args) {
		SpringApplication.run(CousreApiApp.class, args);
		//System.out.print("Helo World");
	}
}
