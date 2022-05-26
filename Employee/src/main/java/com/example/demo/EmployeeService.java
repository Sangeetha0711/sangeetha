package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empdao;
	public String saveDetails(Employee1 e) {
		return empdao.saveDetails(e);
	}
	public Employee1 getDetails(int id) {
		return empdao.getDetails(id);
	}
	public  String updateDetails(Employee1 e) {
		return empdao.updateDetails(e);
	}
	public String deleteDetails(Integer id) {
		return empdao.deleteDetails(id);
	}
	public List<Employee1> allvalues(){
		return empdao.allvalues();
	}

}
