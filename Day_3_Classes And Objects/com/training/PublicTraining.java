
package com.training;
/**
 * @author dbachhav
 *class PublicTraining which is subclass of Training class. so inheritance is achieved.
 */
public class PublicTraining extends Training {
	private int participants;
	public PublicTraining(String subject, double fees, int participants) {
		super(subject, fees);
		this.participants=participants;
	}
	/**
	 * this is the overriding method which is unimplemented in the super class Training.
	 */
	@Override
	public double getOrderValue() {
		return fees*participants;
	}
}
