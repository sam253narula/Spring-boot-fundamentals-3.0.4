package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.FullName;
import com.example.model.MicroStream;
import com.example.serviceImpl.BookstoreCRUDServiceImpl;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringbootBookstoreDesignApplication implements CommandLineRunner {

	@Autowired
	BookstoreCRUDServiceImpl bookstoreCRUDServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBookstoreDesignApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		MicroStream microstream = MicroStream.builder().courseName("Spring Boot design patterns")
		.courseType("IT")
		.instructorName(FullName.builder().firstName("Samarth").lastName("Narula").build())
		.build();
		System.out.println(microstream);
	}

}
