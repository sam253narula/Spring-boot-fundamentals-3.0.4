package com.example.service;

import org.springframework.stereotype.Component;

import com.example.model.MicroStream;

@Component
public interface MicrostreamService {

	MicroStream getInfo();

	MicroStream getCustomInfo(String courseName, String courseType, String firstName, String lastName);

}