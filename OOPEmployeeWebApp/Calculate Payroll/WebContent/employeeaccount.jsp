<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
<style>
	table, th, td {
  border: 1px solid;
}
</style>
</head>
<body>
	<table >
		<c:forEach var="emp" items="${empDetails}">
	
	<tr>
		<td>ID:</td>
		<td>${emp.id}</td>
	</tr>
	<tr>
		<td>Employee Name:</td>
		<td>${emp.name}</td>
	</tr>
	<tr>
		<td>Employee Email:</td>
		<td>${emp.email}</td>
	</tr>
	<tr>
		<td>Employee Phone:</td>
		<td>${emp.phone}</td>
	</tr>
	<tr>
		<td>Employee ID:</td>
		<td>${emp.empID}</td>
	</tr>
	<tr>
		<td>Employee Type:</td>
		<td>${emp.type}</td>
	</tr>
	<tr>
		<td>Working Days:</td>
		<td>${emp.workDays}</td>
	</tr>
	<tr>
		<td>Salary:</td>
		<td>${emp.workDays}*1000</td>
	</tr>
	
	
	</c:forEach>

	</table>
	
	
	
	
	
	<br><br>
	
	
	
	<a href="#"><button>Calculate Salary</button></a>

</body>
</html>