package com.sapient.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sapient.springboot.model.Count;
import com.sapient.springboot.model.Department;
import com.sapient.springboot.model.Description;

@RestController
@RequestMapping("/sapient")
public class DepartmentCatlogController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping(value = "/catlog/{id}", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	public Department getDepartmentCatlog(@PathVariable(name = "id") String id)
	{
		Count count = restTemplate.getForObject("http://DEPARTMENT-COUNT-API/sapient/count/" + Long.valueOf(id), Count.class);
		
		Description description = restTemplate.getForObject("http://DEPARTMENT-DESCRIPTION-API/sapient/description/" + Long.valueOf(id), Description.class);
		
		return new Department(Long.valueOf(id),description.getName(),description.getDeptDescription(),count.getCount());
	}
	
	@RequestMapping(value = "/hello", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	public String getName()
	{
		return "Hello";
	}

}
