package com.noxml.spring.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name="employee1")
public class Employee  implements Serializable{
	@Id
	@Column(name="employeeId")
@XmlElement	private Integer employeeId;
@XmlElement	private String employeeName;
@XmlElement  private int employeeSalary;
@XmlElement   private String employeeDept;
  //  DepartmentDetails dname;
    public Employee(){
    	
    }
	public Employee(Integer id, String employeeName, Integer employeeSalary, String departmant) {
		this.employeeId =id;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		this.employeeDept=departmant;
		
	}
public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getEmployeeDept() {
		return employeeDept;
	}
	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}
public String toString()
{
		return  this.getEmployeeId()+" "+this.getEmployeeName()+" "+this.getEmployeeSalary()+" "+this.getEmployeeDept();
}
	/*public DepartmentDetails getDname() {
		return dname;
	}
	public void setDname(DepartmentDetails dname) {
		this.dname = dname;
	}
		*/
public Integer getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}
}