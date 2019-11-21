package com.sapient.springboot.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.springboot.model.Description;

@RestController
@RequestMapping("/sapient")
public class DepartmentDescriptionController {

	private List<Description> list = Arrays.asList(new Description(1, "CS", "This is CS Department"),
			new Description(2, "IT", "This is IT Department"), new Description(3, "Mech", "This is Mech Department"));

	@RequestMapping(value = "/description/{id}", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	public Description getDescription(@PathVariable(name = "id") String id) {

		return list.stream().filter(i -> i.getDeptId() == Long.valueOf(id)).collect(Collectors.toList()).get(0);

	}

}
