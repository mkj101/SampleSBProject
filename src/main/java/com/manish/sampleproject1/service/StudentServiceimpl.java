package com.manish.sampleproject1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.sampleproject1.dao.StudentDao;
import com.manish.sampleproject1.entity.Student;


@Service
public class StudentServiceimpl implements StudentService{
	
	@Autowired
	private StudentDao studentDao;
	
	@Override
	public List<Student> findAllStudents(){
		List<Student> students=  studentDao.findAll();
		return students;
	}

}
