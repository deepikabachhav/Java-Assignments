/* Write the definition for a class called Distance that has properties feet as integer  and inches as float. The class has the following behaviours/services/methods:
void set(int, float) to give value to object
void disp() to display distance in feet and inches
Distance add(Distance) to sum two distances & return distance */

package distance.objects;
import complex.number.Complex;
public class Distance {
	private int feet;
	private float inch;
	public void set(int feet,float inch){
		this.feet=feet;
		this.inch=inch;
	}
	
	public int getFeet() {
		return feet;
	}

	public void setFeet(int feet) {
		this.feet = feet;
	}

	public float getInch() {
		return inch;
	}

	public void setInch(float inch) {
		this.inch = inch;
	}
	
	public void display(){
		System.out.println(feet +"." +inch + "'");
	}

	public Distance sum(Distance objectOne, Distance objectTwo){
		Distance object=new Distance();
		object.feet =objectOne.feet+ objectTwo.feet;
		object.inch =objectOne.inch + objectTwo.inch;
		if(object.inch >=12.0){
			object.inch -=12.0;
			object.feet++;
		}
		object.display();
		return object;
	}
}
