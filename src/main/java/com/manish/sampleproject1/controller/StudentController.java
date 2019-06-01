package com.manish.sampleproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manish.sampleproject1.entity.Student;
import com.manish.sampleproject1.service.StudentServiceimpl;

@RestController
@RequestMapping("api/student/")
public class StudentController {

	@Autowired
	private StudentServiceimpl studentService;

	
	@RequestMapping(value = "allStudents", method= RequestMethod.GET)
	    public List<Student> listOfAllStudents(){
		 List<Student> students = studentService.findAllStudents();
		 
	        return students;
	    }

}
