package com.app.file;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * @author dbachhav
 *Employee is a class which implements serialization and deserialization for writing and reading file.
 */
public class Employee implements Serializable {
	public int employeeId;
	public String employeeName;
	public double employeeSalary;
	/**
	 * constructor  of employee class with the fields.
	 * @param employeeId
	 * @param employeeName
	 * @param employeeSalary
	 */
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}

}
