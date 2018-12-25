package com.capgemini.bankemployee;

public class EmployeeInformation {
	private int employeeId;
	private String employeeName;
	private String designation;
	private double employeeSalary;
	private String employeeComm;

	public EmployeeInformation(int employeeId, String employeeName,
			String designation, double employeeSalary, String employeeComm) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.employeeSalary = employeeSalary;
		this.employeeComm = employeeComm;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public String getEmployeeComm() {
		return employeeComm;
	}

	@Override
	public String toString() {
		return "EmployeeInformation [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", designation="
				+ designation + ", employeeSalary=" + employeeSalary
				+ ", employeeComm=" + employeeComm + "]";
	}
}
