package com.manish.sampleproject1.service;

import java.util.List;

import com.manish.sampleproject1.entity.College;
import com.manish.sampleproject1.entity.Student;

public interface StudentService {

	public List<Student> findAllStudents();
	
	public Student addStudent(Student student);
}
