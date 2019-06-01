package com.manish.sampleproject1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manish.sampleproject1.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long>{
	
}
