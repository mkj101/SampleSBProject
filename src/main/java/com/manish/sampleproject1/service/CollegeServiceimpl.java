package com.manish.sampleproject1.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manish.sampleproject1.dao.CollegeDao;
import com.manish.sampleproject1.entity.College;


@Service
public class CollegeServiceimpl implements CollegeService{
	
	@Autowired
	private CollegeDao collegeDao;
	

	@Override
	public List<College> findAllColleges() {

		List<College> colleges = collegeDao.findAll();
		
		return colleges;
	}


}
