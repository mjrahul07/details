package com.student.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Detailcontroller {
	@Autowired
	Detailservice detailservice;
	@GetMapping("/details")
	public Iterable<Details> view() {
		return detailservice.findAll();
	}
	@PostMapping("/details")
	public Details create(@RequestBody Details details) {
		return detailservice.save(details);

	}
	
	
	
	

}
