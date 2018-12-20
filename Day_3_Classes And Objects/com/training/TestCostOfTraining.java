/* Test class for testing fields */

package com.training;
import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;
public class TestCostOfTraining {

	private Logger logger=Logger.getLogger(Training.class.getName());
	
	@Test
	public void TestPublicTrainingCharges() {
		BasicConfigurator.configure();
		logger.debug("debug");
		Training training= new PublicTraining("Java",5000,50);
		logger.info("info");
		double charges=training.getOrderValue();
		logger.error("error");
		assertEquals(250000.0,charges,0.02);
	}
	
	@Test 
	public void TestCorporateTrainingCharges(){
		Training corporate =new CorporateTraining("BigData", 35000, 4);
		double charges= corporate.getOrderValue();
		assertEquals(140000.0,charges,0.0);
		}
	
	@Test 
	public void TestCorporateTrainingsubject(){
		Training corporate =new CorporateTraining("dotNet", 10000, 60);
		String subject= corporate.getSubject();
		assertEquals("dotNet",subject);
		}
	
	@Test
	public void TestTrainingID() {
		Training training= new PublicTraining("Java", 100,50);
		int id=training.getid();
		assertEquals(104,id);
	}

}
