package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Students;
import com.repository.StudentsMTMRepo;

@RestController
public class StudentsController {

	@Autowired
	StudentsMTMRepo studentsMTMRepo;
	
	
	@PostMapping("/studentInsert")
	public Students insertData(@RequestBody Students students )
	{
		//courseMTM.saveAll(students.getCourse());
		 studentsMTMRepo.save(students);
		 
		 return students;
	}
	
	@GetMapping("/studentDataById/{stdid}")
	public Students getData(@PathVariable("stdid") Integer stdid)
	{
		Optional<Students> opt = studentsMTMRepo.findById(stdid);
		
		if(opt.isEmpty())
		{
			return null;
		}
		else
		{
			return opt.get();
		}
	}
	
	@GetMapping("/getStudentsAllData")
	public List<Students> getAllData()
	{
		return studentsMTMRepo.findAll();
	}
	
	@DeleteMapping("/deleteStudentsData/{stdid}")
	public Students deleteData(@PathVariable("stdid") Integer stdid)
	{
		Students std = studentsMTMRepo.findById(stdid).get();
		studentsMTMRepo.deleteById(stdid);
		return std;
	}
	
	@PutMapping("/updateStudentData")
	public Students updateData(@RequestBody Students students)
	{
		studentsMTMRepo.save(students);
		return students;
	}
}
