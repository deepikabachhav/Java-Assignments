/* Write Class to find area of the rectangle */

package rectangle.objects;
public class Rectangle {
	private double length;
	private double breadth;

	Rectangle(double length, double breadth){       //constructor of rectangle
		this.length=length;
		this.breadth=breadth;
	}
	
	public double getArea() {						// to find area of rectangle
		if(length <0 || breadth <0){
			return 0.0;
		}
		else
		return length*breadth;
	}

	public double getPerimeter() {				//to find perimeter of rectangle
		if(length <0 || breadth <0){
			return 0.0;
		}
		else
		return 2*(length+breadth);
	}
}

