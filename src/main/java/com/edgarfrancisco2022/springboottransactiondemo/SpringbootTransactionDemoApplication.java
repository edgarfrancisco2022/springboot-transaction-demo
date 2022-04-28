package com.edgarfrancisco2022.springboottransactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//If you are not using SpringBoot @EnableTransactionManagement
public class SpringbootTransactionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTransactionDemoApplication.class, args);
	}

}
