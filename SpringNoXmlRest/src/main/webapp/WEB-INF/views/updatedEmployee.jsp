<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
<table border="2" width="40%" cellpadding="1">  
<tr><th>Id</th><th>Name</th><th>Salary</th><th>Department</th></tr>  
   <tr>  
   <td>${employees.employeeId}</td>  
   <td>${employees.employeeName}</td>  
   <td>${employees.employeeSalary}</td>  
   <td>${employees.employeeDept}</td>  
   </tr>  
   
   </table>  
</html>