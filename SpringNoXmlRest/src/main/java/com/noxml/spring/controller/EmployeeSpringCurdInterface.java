package com.noxml.spring.controller;

import java.util.List;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.noxml.spring.model.*;;

public interface EmployeeSpringCurdInterface {
	public @ResponseBody ModelAndView getAllEmployees();
	public  @ResponseBody ModelAndView addEmployee(Employee emp);
	public @ResponseBody  ModelAndView deleteEmployee(Employee employee);
	public @ResponseBody  ModelAndView updateEmployee(Employee emp);
}
