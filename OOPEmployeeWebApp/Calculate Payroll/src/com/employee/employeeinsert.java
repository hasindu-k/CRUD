package com.employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/employeeinsert")
public class employeeinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public employeeinsert() {
        super();
        
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String empID = request.getParameter("empID");
		String workDays = request.getParameter("workDays");
		String jobrole = request.getParameter("user_job");
		String salary = request.getParameter("salary");
		
		Integer days = Integer.parseInt(workDays);	
		
		boolean isTrue;
		
		System.out.println(workDays);
		
		isTrue = EmployeeDBUtil.insertemployee(empID, days, jobrole, salary);
		
		System.out.println(isTrue);
		
		if (isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
