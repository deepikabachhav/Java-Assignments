package com.capgemini.bankemployee;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
/**
 * @author dbachhav
 *Test class for testing relation between two objects.
 */
public class TestEmployee {

	@Test
	public void testRelationOne() {
		EmployeeInformation employeeOne=new EmployeeInformation(101,"Deepika","Analyst",18000.0,"8378013652");
		MMASavingAccount accountOne =new MMASavingAccount("Deepika",560320.0,100,true);
		EmployeeAccountRelation relationOne=new EmployeeAccountRelation(employeeOne,accountOne);
		Map<String,EmployeeAccountRelation> map= new HashMap<>();
		map.put("Deepika", relationOne);
		assertEquals("EmployeeAccountRelation [employeeInformation=EmployeeInformation [employeeId=101, employeeName=Deepika, designation=Analyst, employeeSalary=18000.0, employeeComm=8378013652], mmSavingAccount=MMASavingAccount [accountHolderName=Deepika, accountBalance=560320.0, accountid=100, isSalary=true]]",relationOne.toString());
	}
	
  	@Test
	public void testRelationTwo() {
		EmployeeInformation employeeTwo=new EmployeeInformation(102,"Ankita","Developer",17000.0,"896532652");
		MMASavingAccount accountTwo =new MMASavingAccount("Ankita",568921.0,101,true);
		EmployeeAccountRelation relationTwo=new EmployeeAccountRelation(employeeTwo,accountTwo);
		Map<String,EmployeeAccountRelation> map= new HashMap<>();
		map.put("Ankita", relationTwo);
		assertEquals("EmployeeAccountRelation [employeeInformation=EmployeeInformation [employeeId=102, employeeName=Ankita, designation=Developer, employeeSalary=17000.0, employeeComm=896532652], mmSavingAccount=MMASavingAccount [accountHolderName=Ankita, accountBalance=568921.0, accountid=101, isSalary=true]]",relationTwo.toString());
  	}
  	
	@Test
	public void testRelationThree() {
		EmployeeInformation employeeThree=new EmployeeInformation(103,"Rashmi","Associate Engineer",15500.0,"98654013652");
		MMASavingAccount accountThree =new MMASavingAccount("Rashmi",965310.0,112,false);
		EmployeeAccountRelation relationThree=new EmployeeAccountRelation(employeeThree,accountThree);
		Map<String,EmployeeAccountRelation> map= new HashMap<>();
		map.put("Rashmi", relationThree);
		assertEquals("EmployeeAccountRelation [employeeInformation=EmployeeInformation [employeeId=103, employeeName=Rashmi, designation=Associate Engineer, employeeSalary=15500.0, employeeComm=98654013652], mmSavingAccount=MMASavingAccount [accountHolderName=Rashmi, accountBalance=965310.0, accountid=112, isSalary=false]]",relationThree.toString());
	}
	@Test
	public void testRelationFour() {
		EmployeeInformation employeeFour=new EmployeeInformation(101,"Pranjali","system engineer",563200.0,"896547856856");
		MMASavingAccount accountFour =new MMASavingAccount("Pranjali",235680.0,123,true);
		EmployeeAccountRelation relationFour=new EmployeeAccountRelation(employeeFour,accountFour);
		Map<String,EmployeeAccountRelation> map= new HashMap<>();
		map.put("Pranjali", relationFour);
		assertEquals("EmployeeAccountRelation [employeeInformation=EmployeeInformation [employeeId=101, employeeName=Pranjali, designation=system engineer, employeeSalary=563200.0, employeeComm=896547856856], mmSavingAccount=MMASavingAccount [accountHolderName=Pranjali, accountBalance=235680.0, accountid=123, isSalary=true]]",relationFour.toString());
	}
}
