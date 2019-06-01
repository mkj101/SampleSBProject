package com.manish.sampleproject1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manish.sampleproject1.entity.College;
import com.manish.sampleproject1.service.CollegeServiceimpl;

@RestController
@RequestMapping("api/college/")
public class CollegeController {

	@Autowired
	private CollegeServiceimpl collegeService;

	
	@RequestMapping(value = "allCollege", method= RequestMethod.GET)
	    public List<College> listOfAllColleges(){
		List<College> colleges = collegeService.findAllColleges();
		 
	        return colleges;
	    }

}
