package com.capgemini.bankemployee;

public class EmployeeAccountRelation {
	private EmployeeInformation employeeInformation;
	private MMASavingAccount mmSavingAccount;
	
	public EmployeeAccountRelation(EmployeeInformation employeeInformation,
			MMASavingAccount mmSavingAccount) {
		super();
		this.employeeInformation = employeeInformation;
		this.mmSavingAccount = mmSavingAccount;
	}

	@Override
	public String toString() {
		return "EmployeeAccountRelation [employeeInformation="
				+ employeeInformation + ", mmSavingAccount=" + mmSavingAccount
				+ ", toString()=" + super.toString() + "]";
	}

	
}
