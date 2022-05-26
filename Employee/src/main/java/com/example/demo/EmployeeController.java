package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/add")
	public String saveDetails(@RequestBody Employee1 e) {
		return empser.saveDetails(e);
	}
	@GetMapping(value="/show/{id}")
	public Employee1 getDetails(@PathVariable int id) {
		return empser.getDetails(id);
	}
	@PutMapping(value="/update")
	public String updateDetails(@RequestBody Employee1 e) {
		return empser.updateDetails(e);
	}
	@DeleteMapping(value="/delete/{id}")
	public String deleteDetails(@PathVariable Integer id) {
		return empser.deleteDetails(id);
	}
	@GetMapping(value="getall")
	public List<Employee1> allvalues(){
		return empser.allvalues();
	}
	
	

}
