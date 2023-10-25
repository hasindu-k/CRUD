<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update details</title>
<link rel="stylesheet" href="https://codepen.io/gymratpacks/pen/VKzBEp#0">
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/main.css">
        
</head>
<body>

	<div class="row">
    <div class="col-md-12">
      <form action="update" method="POST">
        <h1> Update Details </h1>
       
        <fieldset>  
        
          <legend><span class="number">1</span> Employee Profile</legend>
          
          <label for="empID">Employee ID:</label>
          <input type="text" id="empID" name="empID">
          
         <label for="workDays">No of Working Days:</label>
          <input type="text" id="workDays" name="workDays">
        
          
          <label for="salary">Salary:</label>
          <input type="text" id="salary" name="salary">

         </fieldset>
       
        <button type="submit">Update List</button>
        
       </form>
        </div>
      </div>

</body>
</html>