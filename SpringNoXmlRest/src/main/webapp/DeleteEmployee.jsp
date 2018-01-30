<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<script>

function submitStudentInfo(){
	
	var frmStudent = document.getElementById("frm_student");
	var methodElement = document.getElementById("hdn_method");
	
	if("PUT" != methodElement.value){
		frmStudent.method= "POST";
	}
	
	frmStudent.submit();
}
</script>

<body>
<h2 align ="center">Edit Employee Detail</h2>

<form align="center" id="frm_student" action="deleteEmployee">
<input type="hidden" id="hdn_method" name="method_name" value=""/>
<input type="hidden" id="hdn_sId" name="s_id" value=""/>

EmployeeId: <input id="txt_sName" name="employeeId" type="text"/><br/>
<input id="btn_add" type="button" value="Delete Employee" onclick="submitStudentInfo()"/>
</form>
</body>
</html>