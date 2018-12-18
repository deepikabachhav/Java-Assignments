package vehicle.classeAndObjects;

public class Vehicle {
	private float currentSpeed;
	private String ownerName;
	private float currentDirection;
	private String [] directionArray = {"North","NorthWest", "West" , "SouthWest" , "South" , "SouthEast" , "East" ,"NorthEast"};
	private static int highestVehicleIdentificationNumber;
	private static String direction = "";
	private int VehicleIdentificationNumber;
	private static final boolean TURN_LEFT = false;
	private static final boolean TURN_RIGHT = true;
	
	public Vehicle(){
		VehicleIdentificationNumber= highestVehicleIdentificationNumber +1;
		highestVehicleIdentificationNumber= highestVehicleIdentificationNumber > VehicleIdentificationNumber ? highestVehicleIdentificationNumber :VehicleIdentificationNumber; 
	}
	
}
