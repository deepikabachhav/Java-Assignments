package com.capgemini.bankemployee;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestEmployee {

	@Test
	public void test() {
		EmployeeInformation employeeOne=new EmployeeInformation(101,"Deepika","Analyst",18000.0,"8378013652");
		MMASavingAccount accountOne =new MMASavingAccount("Deepika",560320.0,100,true);
		EmployeeAccountRelation relationOne=new EmployeeAccountRelation(employeeOne,accountOne);
		
		EmployeeInformation employeeTwo=new EmployeeInformation(102,"Ankita","Developer",17000.0,"896532652");
		MMASavingAccount accountTwo =new MMASavingAccount("Ankita",568921.0,101,true);
		EmployeeAccountRelation relationTwo=new EmployeeAccountRelation(employeeTwo,accountTwo);
		
		EmployeeInformation employeeThree=new EmployeeInformation(103,"Rashmi","Associate Engineer",15500.0,"98654013652");
		MMASavingAccount accountThree =new MMASavingAccount("Rashmi",965310.0,112,false);
		EmployeeAccountRelation relationThree=new EmployeeAccountRelation(employeeThree,accountThree);

		
		EmployeeInformation employeeFour=new EmployeeInformation(101,"Pranjali","system engineer",563200.0,"896547856856");
		MMASavingAccount accountFour =new MMASavingAccount("Pranjali",235680.0,123,true);
		EmployeeAccountRelation relationFour=new EmployeeAccountRelation(employeeFour,accountFour);

		Map<String,EmployeeAccountRelation> map= new HashMap<>();
		map.put("Deepika", relationOne);
		map.put("Ankita", relationTwo);
		map.put("Rashmi", relationThree);
		map.put("Pranjali", relationFour);
		System.out.println(relationOne.toString());
	}

}
