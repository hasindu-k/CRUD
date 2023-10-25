package com.employee;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String phone;
	private int workDays;
	private String empID;
	private String type;
	
	public Employee(int id, String name, String email, String phone, int workDays, String empID, String type) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.workDays = workDays;
		this.empID = empID;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getWorkDays() {
		return workDays;
	}

	public String getEmpID() {
		return empID;
	}

	public String getType() {
		return type;
	}
	
	
	
}
