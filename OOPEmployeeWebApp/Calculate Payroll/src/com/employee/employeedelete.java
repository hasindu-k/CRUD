package com.employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employeedelete") // URL mapping for this servlet
public class employeedelete extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public employeedelete() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String empID = request.getParameter("empID"); // Get the employee ID from the request

        boolean isDeleted = EmployeeDBUtil.deleteEmployee(empID); // Call the deleteEmployee method

        if (isDeleted) {
            RequestDispatcher dis = request.getRequestDispatcher("success.jsp"); // Forward to success page
            dis.forward(request, response);
        } else {
            RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp"); // Forward to failure page
            dis2.forward(request, response);
        }
    }
}
