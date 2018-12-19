package vehicle.classeAndObjects;

public class Vehicle {
	private double currentSpeed;
	private String ownerName;
	private double currentDirection;
	private String [] directionArray = {"North","NorthEast", "East" , "SouthEast" , "South" , "SouthWest" , "West" ,"NorthWest"};
	private static int highestVehicleIdentificationNumber;
	private static String direction = "";
	private int VehicleIdentificationNumber;
	private static final boolean TURN_LEFT = false;
	private static final boolean TURN_RIGHT = true;
	
	public Vehicle(){			//no argument constructor for identification numbers.
		VehicleIdentificationNumber= highestVehicleIdentificationNumber +1;
		highestVehicleIdentificationNumber= highestVehicleIdentificationNumber > VehicleIdentificationNumber ? highestVehicleIdentificationNumber :VehicleIdentificationNumber; 
	}
	
	public Vehicle(String ownerName){		//argument constructor for ownerName of the vehicle.
		this.ownerName=ownerName;
		VehicleIdentificationNumber= highestVehicleIdentificationNumber +1;
		highestVehicleIdentificationNumber= highestVehicleIdentificationNumber > VehicleIdentificationNumber ? highestVehicleIdentificationNumber :VehicleIdentificationNumber; 
	}
	
	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(float currentSpeed) {
		this.currentSpeed =((this.currentSpeed + currentSpeed)<=180  && (this.currentSpeed + currentSpeed)>=0) ? this.currentSpeed+currentSpeed : 0;
	}

	public double getCurrentDirection() {
		return currentDirection;
	}
	
	public int getVehicleIdentificationNumber() {
		return VehicleIdentificationNumber;
	}
	
	public int highestVehicleIdentificationNumber(){
		return highestVehicleIdentificationNumber;
	}
	
	public void changeSpeed(double newSpeed){			//method for changeSpeed if the speed of vehicle is increased then add currentSpeed with the newSpeed.
		if((currentSpeed + newSpeed)<180 && (currentSpeed + newSpeed)>0){
			currentSpeed +=newSpeed;
		}
		else
			currentSpeed=currentSpeed;
	}
	
	public void vehicleStop(){			//method for vehicleStop when currentSpeed is zero means vehicle stops.
		currentSpeed=0;
	}

	public void turnRightOrturnLeft(boolean RightTurnOrLeftTurn, double degrees){		//method to get direction to turn right or left.
		if(RightTurnOrLeftTurn){
			if((currentDirection + degrees)<=360){
				currentDirection +=degrees;  
				
					if(currentDirection==0 || currentDirection ==360){
						direction= directionArray[0];
					
					if(currentDirection >0 && currentDirection <90)
						direction=directionArray[1];
					
					if(currentDirection  ==90)
						direction=directionArray[2];
					
					if(currentDirection >90 && currentDirection <180)
						direction= directionArray[3];
					
					if(currentDirection  ==180)
						direction=directionArray[4];
					
					if(currentDirection >180 && currentDirection <270)
						direction= directionArray[5];
					
					if(currentDirection  ==270)
						direction=directionArray[6];
					
					if(currentDirection >270 && currentDirection <360)
						direction= directionArray[7];		
					}
			}
			else{
				if((currentDirection + degrees)>= -360){
					currentDirection -=degrees;
					
					if(currentDirection==0 || currentDirection==-360)
						direction =  directionArray[0];
					

					if(currentDirection <0 && currentDirection >(-90))
						direction =  directionArray[7];
					
					if(currentDirection == (-90))
						direction =  directionArray[6];
					
					if(currentDirection < (-90)  && currentDirection >(-180))
						direction =  directionArray[5];
					
					if(currentDirection ==(-180))
						direction =  directionArray[4];

					if(currentDirection < (-180)  && currentDirection >(-270))
						direction =  directionArray[3];
					
					if(currentDirection == (-270))
						direction =  directionArray[2];

					if(currentDirection < (-270)  && currentDirection >(-360))
						direction =  directionArray[1];
				}
			}
		}
	}
	
	@Override
	public String toString() {
				return "Vehicle [currentSpeed=" + currentSpeed + ", ownerName="
						+ ownerName + ", currentDirection=" + currentDirection
						+ ", VehicleIdentificationNumber="
						+ VehicleIdentificationNumber + "]";
	}
	
	public static void main(String[] args){
		Vehicle vehicle= new Vehicle();
		Vehicle bike= new Vehicle();
		bike.setCurrentSpeed(70);
		bike.changeSpeed(30);
		System.out.println(bike.getCurrentSpeed());
		System.out.println(vehicle.getVehicleIdentificationNumber());
		System.out.println(bike.getVehicleIdentificationNumber());
		Vehicle car= new Vehicle();
		System.out.println(car.getVehicleIdentificationNumber());
		System.out.println(bike.getCurrentDirection());
		bike.turnRightOrturnLeft(true, 90);
		bike.turnRightOrturnLeft(false, 90);
		bike.turnRightOrturnLeft(false, 30);
		bike.highestVehicleIdentificationNumber();
		System.out.println(bike.toString());
		System.out.println(vehicle.toString());
	}
}
