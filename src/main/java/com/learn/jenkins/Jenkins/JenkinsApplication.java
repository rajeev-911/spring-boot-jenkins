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
	public void start(){
		logger.info("Application Started.....");

	}
	public static void main(String[] args) {
		logger.info("Application Executed.....");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
