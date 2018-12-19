package com.training;
/**
 * @author dbachhav
 *CorporateTraining class is a subclass of Training Class.
 */
public class CorporateTraining extends Training {
	private int days;
	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days=days;
	}
/**
 * Overriding method which is implemented in this class.
 */
	@Override
	double getOrderValue() {
		return fees* days;
	}
}
