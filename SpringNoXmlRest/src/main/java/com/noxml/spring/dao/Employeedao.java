package com.noxml.spring.dao;

import java.util.List;

import com.noxml.spring.model.*;

public interface Employeedao {
public List<Employee> getAllEmployees();
public void updateEmployee(Employee emp);
public void deleteEmployee(Integer emp);
public void addEmployee(Employee emp);

}
