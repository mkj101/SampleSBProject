package com.manish.sampleproject1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.manish.sampleproject1.entity.Student;
import com.manish.sampleproject1.service.StudentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Sampleproject1ApplicationTests {

	@Autowired
	private StudentService studentService;
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testFindAllStudents() {
		List<Student> students = studentService.findAllStudents();
		
		assertEquals(2, students.size());
	}
	
}
