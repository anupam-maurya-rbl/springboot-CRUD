package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
public class Controller {

	@Autowired
	private StudnetService service;

	// Get all students
	@GetMapping("/getme") // http://localhost:8080/getme
    public ResponseEntity<List<Student>> getStudents(HttpServletRequest req) {
		System.out.println("get me method....");
		System.out.println(req.getHeader("User-Agent"));
		List<Student> list = service.getStudents();
		
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	// Create a new student

	@PostMapping(value = "/create", consumes = { "application/json" })   // http://localhost:8080/create
	
	public ResponseEntity<String> createStudent(@RequestBody Student st) {
		System.out.println("method processed..");
		System.out.println(st);
		boolean isAdded = service.addStudnet(st);
		if (isAdded) {
			return new ResponseEntity<>("Student Added Successfully", HttpStatus.CREATED);
		} else {
			return new ResponseEntity<>("Student not added", HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping(value = "/update/{i}", consumes = { "application/json" })
	public ResponseEntity<String> updateStudent(@PathVariable int i, @RequestBody Student st) {
		boolean b = service.updateStudnet(i, st);
		if (b)
			return new ResponseEntity<>("Student updated Successfully", HttpStatus.CREATED);
		else
			return new ResponseEntity<>("Student not Successfully", HttpStatus.CREATED);
	}
}