<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Insert Details</title>
        <link rel="stylesheet" href="https://codepen.io/gymratpacks/pen/VKzBEp#0">
        <link href='https://fonts.googleapis.com/css?family=Nunito:400,300' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
      <div class="row">
    <div class="col-md-12">
      <form action="insert" method="POST">
        <h1> Insert Details </h1>
        <!-- 
        <fieldset>
          
          <legend><span class="number">1</span> Basic Info</legend>
        
          <label for="name">Name:</label>0
          <input type="text" id="name" name="user_name">
         
          <label for="email">Email:</label>
          <input type="email" id="mail" name="user_email">
       
          <label for="phone">Phone:</label>
          <input type="text" id="phone" name="user_phone">
          
        </fieldset>  
        -->
        <fieldset>  
        
          <legend><span class="number">2</span> Employee Profile</legend>
          
          <label for="empID">Employee ID:</label>
          <input type="text" id="empID" name="empID">
          
         <label for="workDays">No of Working Days:</label>
          <input type="text" id="workDays" name="workDays">
        
       
        
         <label for="job">Job Role:</label>
          <select id="job" name="user_job">
              <option value="worker">Worker</option>
              <option value="Supervisor">Supervisor</option>
          </select>
          
          <label for="salary">Salary:</label>
          <input type="text" id="salary" name="salary">

         </fieldset>
       
        <button type="submit">Add Salary to List</button>
        
       </form>
        </div>
      </div>
      
    </body>
</html>


