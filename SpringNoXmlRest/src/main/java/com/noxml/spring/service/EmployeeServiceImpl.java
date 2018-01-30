package com.noxml.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.noxml.spring.dao.Employeedao;
import com.noxml.spring.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private Employeedao employeedao;
	
	
	
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeedao.getAllEmployees();
	}

	public void updateEmployee(Employee emp) {
		employeedao.updateEmployee(emp);

	}

	public void deleteEmployee(Integer emp) {
		employeedao.deleteEmployee(emp);

	}

	public void addEmployee(Employee emp) {
		employeedao.addEmployee(emp);

	}

}
