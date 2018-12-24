package com.collection;
/** 
 * @author dbachhav
 *CarOne class implements comparable  which override compareTo() method depends on the make year of the car.
 */
public class CarOne implements Comparable {
	private String make;
	private String model;
	private int year;
	private double price;

	public CarOne(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year
				+ ", price=" + price + "]";
	}
	
	@Override
	public int compareTo (Object o){
		CarOne car=(CarOne) o;
		System.out.println(this.year-car.year);
		return this.year-car.year;
	}
}
