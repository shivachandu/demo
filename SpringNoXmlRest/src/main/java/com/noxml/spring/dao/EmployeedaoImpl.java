package com.noxml.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.noxml.spring.model.Employee;
@Repository
public class EmployeedaoImpl implements Employeedao {
	@Autowired
	 private SessionFactory sessionFactory;
	
	    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
		
	    public List<Employee> getAllEmployees() {
	    	Session session = this.sessionFactory.openSession();
			@SuppressWarnings("unchecked")
			List<Employee> employees = session.createQuery("from Employee").list();
			session.close();
			return employees;
	    	  
	    	  
	}

		public void updateEmployee(Employee emp) {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Query qry = session.createQuery("update Employee set employeeName =:n,employeeDept=:d,employeeSalary=:s where employeeId=:id  ");
			qry.setParameter("n", emp.getEmployeeName());
			qry.setParameter("id", emp.getEmployeeId());
			qry.setParameter("d", emp.getEmployeeDept());
			qry.setParameter("s", emp.getEmployeeSalary());

			qry.executeUpdate();
			tx.commit();// transaction is commited
			session.close();
			
			System.out.println("successfully updated");
			
		}

		public void deleteEmployee(Integer employeeId) {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();
			Query qry = session.createQuery(" delete from Employee where employeeId =:i");
			qry.setParameter("i", employeeId);
			qry.executeUpdate();
			 System.out.println("employee delete"+qry);
			 tx.commit();// transaction is commited
				session.close();
				
		}

		@SuppressWarnings("unchecked")
		public void addEmployee(Employee emp) {
			Session session = this.sessionFactory.openSession();
			Transaction tx = session.beginTransaction();

			Employee employee = new Employee();

			employee.setEmployeeId(emp.getEmployeeId());
			employee.setEmployeeName(emp.getEmployeeName());
			employee.setEmployeeDept(emp.getEmployeeDept());
			employee.setEmployeeSalary(emp.getEmployeeSalary());
			session.persist(employee);// persisting the objec
			tx.commit();// transaction is commited
			
			System.out.println("successfully saved");
			;
		}
		}


