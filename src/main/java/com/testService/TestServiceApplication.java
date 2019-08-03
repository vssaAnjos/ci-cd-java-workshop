package com.testService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication /** This is the javadoc example. */
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration /** This is the javadoc example. */

public class TestServiceApplication {
	/** Metodo main */
	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}
}
