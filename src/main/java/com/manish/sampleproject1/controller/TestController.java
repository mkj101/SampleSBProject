package com.manish.sampleproject1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {
	
	 @RequestMapping(value = "/list", method= RequestMethod.GET)
	    public String list(String x){
	        System.out.println("printing the coming input "+x);
	        return "Sending incoming as response: "+x;
	    }

}
