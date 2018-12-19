package vehicle.classeAndObjects;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVehicle {

	@Test
	public void test() {
		Vehicle vehicle =new Vehicle();
		Vehicle bike= new Vehicle();
		bike.setCurrentSpeed(70);
		bike.changeSpeed(30);
		System.out.println(bike.getCurrentSpeed());
		bike.turnRightOrturnLeft(true, 90);
		System.out.println(bike.getCurrentDirection());
		bike.turnRightOrturnLeft(false, 90);
		System.out.println(bike.getCurrentDirection());
		System.out.println(bike.toString());
		System.out.println(vehicle.toString());
		System.out.println(bike.highestVehicleIdentificationNumber());
	}

}
