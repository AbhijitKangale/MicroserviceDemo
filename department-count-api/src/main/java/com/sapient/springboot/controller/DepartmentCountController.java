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

import com.sapient.springboot.model.Count;

@RestController
@RequestMapping("/sapient")
public class DepartmentCountController {

	private List<Count> list = Arrays.asList(new Count(1, 4), new Count(2, 6), new Count(3, 8));

	@RequestMapping(value = "/count/{id}", method = { RequestMethod.GET })
	@ResponseStatus(HttpStatus.OK)
	public Count getCount(@PathVariable(name = "id") String id) {
		return list.stream().filter(i -> i.getDeptId() == Long.valueOf(id)).collect(Collectors.toList()).get(0);
	}
}
