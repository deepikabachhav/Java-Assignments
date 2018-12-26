package com.capgemini.bankemployee;
/**
 * @author dbachhav
 *EmployeeAccountRelation is a class to maintain relation between two classes EmployeeInformation and MMASavingAccount.
 *The class has instance members as instance of other class.
 */
public class EmployeeAccountRelation {
	private EmployeeInformation employeeInformation;
	private MMASavingAccount mmSavingAccount;
	
	/**
	 * constructor of the class to initiate instance members. 
	 * @param employeeInformation
	 * @param mmSavingAccount
	 */
	public EmployeeAccountRelation(EmployeeInformation employeeInformation,
			MMASavingAccount mmSavingAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmSavingAccount = mmSavingAccount;
	}
	/**
	 * toString() overriding method to display values of instance members.
	 */
	@Override
	public String toString() {
		return "EmployeeAccountRelation [employeeInformation="
				+ employeeInformation + ", mmSavingAccount=" + mmSavingAccount
				+ "]";
	}

}
