package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.model.FullName;
import com.example.model.MicroStream;
import com.example.service.MicrostreamService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MicrostreamServiceImpl implements MicrostreamService {

	@Override
	public MicroStream getInfo() {

		MicroStream microStream = MicroStream.builder().courseName("Spring Boot design patterns").courseType("IT")
				.instructorName(FullName.builder().firstName("Samarth").lastName("Narula").build()).build();
		log.info("microstream obj -> {}", microStream);
		return microStream;
	}

	@Override
	public MicroStream getCustomInfo(String courseName, String courseType, String firstName, String lastName) {

		return new MicroStream(courseName, courseType, new FullName(firstName, lastName));
	}
}
