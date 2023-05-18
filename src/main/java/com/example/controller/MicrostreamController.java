package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.FullName;
import com.example.model.MicroStream;
import com.example.service.MicrostreamService;

//@Controller
@RestController
public class MicrostreamController {

	@Autowired
	MicrostreamService microstreamService;

	@GetMapping("/info")
//	@ResponseBody
	public MicroStream getInfo() {
		return microstreamService.getInfo();
	}
	
	@PostMapping("/customInfo")
	public MicroStream getCustomInfo(String courseName, String courseType, FullName instructorName) {
		return microstreamService.getCustomInfo(courseName, courseType, instructorName.getFirstName(), instructorName.getLastName());
	}
}
