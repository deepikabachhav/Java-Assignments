package com.capgemini.carparking;

public class ParkedCarOwnerDetails {
	private String ownerName;
	private String carModel;
	private String carNumber;
	private String ownerMobileNumber;
	private String ownerAdderss;
	private int location;
	
	public ParkedCarOwnerDetails(String ownerName, String carModel,
			String carNumber, String ownerMobileNumber, String ownerAdderss) {
		this.ownerName = ownerName;
		this.carModel = carModel;
		this.carNumber = carNumber;
		this.ownerMobileNumber = ownerMobileNumber;
		this.ownerAdderss = ownerAdderss;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getCarModel() {
		return carModel;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public String getOwnerMobileNumber() {
		return ownerMobileNumber;
	}

	public String getOwnerAdderss() {
		return ownerAdderss;
	}
	
	
	
}

