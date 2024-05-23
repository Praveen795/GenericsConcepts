package com.JexlBoot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JexlBoot.app.entity.StudentResult;
import com.JexlBoot.app.service.Jexl_Service;
import com.JexlBoot.app.service.Student_Service;


@RestController
public class MyController {

	@Autowired
	private Student_Service Studentservice;
	
	@Autowired
	private Jexl_Service jexlservice;
	
	/*
	 * get method 
	 */
	
	@GetMapping("/student")
	public List<StudentResult> Getstudents(){
		
		return this.Studentservice.Getstudent();
		
	}
	
	/*
	 * post method
	 */
	
	@PostMapping("/result")
	public String GetMatchedData(@RequestBody StudentResult student) {
		
		return this.jexlservice.Getmatcheddata(student);
		
	}

}
