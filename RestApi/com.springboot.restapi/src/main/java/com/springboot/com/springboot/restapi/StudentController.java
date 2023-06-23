package com.springboot.com.springboot.restapi;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@RequestMapping("/Students")
	public List<StudentDetails> retrievedetails() {

		return Arrays.asList(new StudentDetails(1, "Saurabh", "Acharya Institute of Technology"),
				new StudentDetails(2, "Pathak", "Acharya College of Eng."),
				new StudentDetails(3, "Rahul", "Acharya College of Eng")

		);
	}

}
