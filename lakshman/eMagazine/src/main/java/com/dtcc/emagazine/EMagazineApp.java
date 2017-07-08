package com.dtcc.emagazine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication (exclude = SecurityAutoConfiguration.class)
public class EMagazineApp {

	public static void main(String[] args) {
		SpringApplication.run(EMagazineApp.class, args);
	}
}
