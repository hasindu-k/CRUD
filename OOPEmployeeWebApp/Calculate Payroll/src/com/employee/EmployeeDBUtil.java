package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDBUtil {
	
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Employee> validate(String empID) {

		ArrayList<Employee> emp = new ArrayList<>();

			// validate
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from employee where empID = '" + empID + "' "; // query
			rs = stmt.executeQuery(sql); // run sql query

			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				int workDays = rs.getInt(5);
				String emp_ID = rs.getString(6);
				String type = rs.getString(7);

				Employee e = new Employee(id, name, email, phone, workDays, emp_ID, type);
				emp.add(e);
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace(); // print error
		}

		return emp;

	}

	public static boolean insertemployee(String empID, Integer workDays, String jobrole, String salary) {
		boolean isSuccess = false;

		
		try {

			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into salary (empId, workDays, job, amount) values('"+empID+"','"+workDays+"','"+jobrole+"','"+salary+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static boolean updateEmployee(String empID, Integer workDays, String salary) {
		boolean isSuccess = false;
	
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
	
			// Create the SQL update statement with a WHERE clause to target a specific employee by empId
			String sql = "UPDATE salary SET workDays = " + workDays + ", amount = '" + salary + "' WHERE empId = '" + empID + "'";
			int rs = stmt.executeUpdate(sql);
	
			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	public static boolean deleteEmployee(String empID) {
		boolean isSuccess = false;
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			
			// Create the SQL delete statement with a WHERE clause to target a specific employee by empId
			String sql = "DELETE FROM salary WHERE empId = '" + empID + "'";
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	

	
}
