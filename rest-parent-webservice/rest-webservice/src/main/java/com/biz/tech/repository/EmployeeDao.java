package com.biz.tech.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biz.tech.models.Employee;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee,Long>{

	
}
