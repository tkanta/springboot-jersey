package com.biz.tech.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.biz.tech.models.Employee;
import com.biz.tech.repository.EmployeeDao;

@Component
@Path("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao empDao;
	
	@GET
	@Produces("application/json")
	public Employee getEmployee(){
		Employee emp = empDao.findOne(1L);
		System.out.println("Employee detail :"+emp.getFirstName()); 
		return emp;
	}
}
