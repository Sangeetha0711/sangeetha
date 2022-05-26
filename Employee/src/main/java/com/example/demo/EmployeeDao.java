package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepo emplorepo;
	public String saveDetails(Employee1 e) {
		emplorepo.save(e);
		return "Successfully saved";
	}
	public Employee1 getDetails(int id) {
		return emplorepo.findById(id).get();
	}
	public String updateDetails(Employee1 e) {
		emplorepo.save(e).getId();
		return "Data updated";
	}
	public String deleteDetails(Integer id) {
		emplorepo.deleteById(id);
		return "data has been deleted";
	}
	public List<Employee1> allvalues(){
		return emplorepo.findAll();
	}

}
