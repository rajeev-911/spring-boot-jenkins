package com.learn.jenkins.Jenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

@SpringBootApplication
public class JenkinsApplication {
	public static Logger logger = LoggerFactory.getLogger(JenkinsApplication.class);

	@PostConstruct
	public static void start(){
		logger.info("Application Started.....");
		logger.info("Application Started =2.....");

	}
	public static void main(String[] args) {
		logger.info("Application Executed.....");
		start();
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
