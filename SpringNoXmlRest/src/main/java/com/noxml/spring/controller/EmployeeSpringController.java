package com.noxml.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.noxml.spring.model.Employee;
import com.noxml.spring.service.*;

@RestController
public class EmployeeSpringController  {

	@Autowired
 	EmployeeService employeeservice;
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public @ResponseBody ModelAndView  getAllEmployees() {
		List<Employee> employees = employeeservice.getAllEmployees();
		System.out.println("reached" +employees);
		ModelAndView model = new ModelAndView("viewemployees","employees",employees);
			model.addObject(employees);
		return model;	
	}
	@RequestMapping(method = RequestMethod.POST,value = "/addEmployee")
	public @ResponseBody ModelAndView addEmployee(@RequestBody Employee emp) {
		Employee empl =new Employee();
		System.out.println(emp.getEmployeeId());
		empl.setEmployeeId(emp.getEmployeeId());
		empl.setEmployeeName(emp.getEmployeeName());
		empl.setEmployeeDept(emp.getEmployeeDept());
		empl.setEmployeeSalary(emp.getEmployeeSalary());
		employeeservice.addEmployee(empl);
		 
		 ModelAndView model =new ModelAndView("AddEmployees","employees",emp);
		return model;	
	}
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.DELETE)
	public @ResponseBody  ModelAndView  deleteEmployee(@RequestBody Employee emp) {	
		employeeservice.deleteEmployee(emp.getEmployeeId());
		ModelAndView model = new ModelAndView("deleteEmployee");
		model.addObject("message","employee with " +emp.getEmployeeId()+""+"deleted");
		return model;	
	}
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.PUT)
	public @ResponseBody ModelAndView updateEmployee( @RequestBody Employee emp) {
		Employee empl =new Employee();
		empl.setEmployeeId(emp.getEmployeeId());
		empl.setEmployeeName(emp.getEmployeeName());
		empl.setEmployeeDept(emp.getEmployeeDept());
		empl.setEmployeeSalary(emp.getEmployeeSalary());
		employeeservice.updateEmployee(empl);
		 ModelAndView model =new ModelAndView("updatedEmployee","employees",emp);
			return model;
	}

}

/*
 @Controller
public class EmployeeSpringController  {

	@Autowired
 	EmployeeService employeeservice;
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public @ResponseBody ModelAndView  getAllEmployees() {
		List<Employee> employees = employeeservice.getAllEmployees();
		
		System.out.println("reached" + employees);
		ModelAndView model = new ModelAndView("viewemployees","employees",employees);
			model.addObject(employees)		  ;
		return model;	
	}
	@RequestMapping(method = RequestMethod.POST,value = "/addEmployee")
	public  ModelAndView addEmployee(@ModelAttribute Employee emp) {
		Employee empl =new Employee();
		System.out.println(emp.getEmployeeId());
		empl.setEmployeeId(emp.getEmployeeId());
		empl.setEmployeeName(emp.getEmployeeName());
		empl.setEmployeeDept(emp.getEmployeeDept());
		empl.setEmployeeSalary(emp.getEmployeeSalary());
		employeeservice.addEmployee(empl);
		 
		 ModelAndView model =new ModelAndView("AddEmployees","employees",emp);
		return model;	
	}
	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.POST)
	public   ModelAndView  deleteEmployee(@ModelAttribute Employee emp) {	
		employeeservice.deleteEmployee(emp.getEmployeeId());
		ModelAndView model = new ModelAndView("deleteEmployee");
		model.addObject("message","employee with " +emp.getEmployeeId()+""+"deleted");
		return model;	
	}
	@RequestMapping(value = "/updateEmployee", method = RequestMethod.GET)
	public @ResponseBody ModelAndView updateEmployee( @ModelAttribute("emp")Employee emp) {
		Employee empl =new Employee();
		empl.setEmployeeId(emp.getEmployeeId());
		empl.setEmployeeName(emp.getEmployeeName());
		empl.setEmployeeDept(emp.getEmployeeDept());
		empl.setEmployeeSalary(emp.getEmployeeSalary());
		employeeservice.updateEmployee(empl);
		 ModelAndView model =new ModelAndView("updatedEmployee","employees",emp);
			return model;
	}

}

 */
