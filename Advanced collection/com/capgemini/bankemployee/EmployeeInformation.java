package com.capgemini.bankemployee;
/**
 * @author dbachhav
 *EmployeeInformation is a class has instance members employeeId,employeeName,designation,employeeSalary,employeeComm.
 */
public class EmployeeInformation {
	private int employeeId;
	private String employeeName;
	private String designation;
	private double employeeSalary;
	private String employeeComm;
	
	/**
	 * constructor is used to initiate instance members.
	 * @param employeeId
	 * @param employeeName
	 * @param designation
	 * @param employeeSalary
	 * @param employeeComm
	 */
	public EmployeeInformation(int employeeId, String employeeName,
			String designation, double employeeSalary, String employeeComm) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.designation = designation;
		this.employeeSalary = employeeSalary;
		this.employeeComm = employeeComm;
	}
	
	/**
	 * getter() method to return values.
	 * @return
	 */
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
	/**
	 * toString() method to display values of instance members.
	 */
	@Override
	public String toString() {
		return "EmployeeInformation [employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", designation="
				+ designation + ", employeeSalary=" + employeeSalary
				+ ", employeeComm=" + employeeComm + "]";
	}
}
