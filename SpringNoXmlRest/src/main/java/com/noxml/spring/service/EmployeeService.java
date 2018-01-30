package com.noxml.spring.service;

import java.util.List;

import com.noxml.spring.model.Employee;

public interface EmployeeService  {
	public List<Employee> getAllEmployees();
	public void updateEmployee(Employee emp);
	public void deleteEmployee(Integer emp);
	public void addEmployee(Employee emp);

}
