package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Course;
import com.entity.Students;
import com.repository.CourseMTM;
@RestController
public class CourseController {

	@Autowired
	CourseMTM coursemtm;
	
	
}
