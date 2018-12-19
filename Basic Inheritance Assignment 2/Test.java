abstract class Shape{
	abstract void draw();
}
class Triangle extends Shape{
	Triangle(){
		
	}
	@Override
	void draw() {
		
	}
}
class Polygon extends Shape{
	Polygon(){
		
	}
	@Override
	void draw() {
		
		
	}
	
}
class Circle extends Shape{
	Circle(){
		
	}
	@Override
	void draw() {
		
		
	}
}

public class Test {
	public static void main(String args[]){
		 Shape shape[]= new Shape[3];
		shape[0]=new Triangle();
		shape[1]= new Polygon();
		shape[2]=new Circle();
		shape[0].draw();
		shape[1].draw();
		shape[2].draw();
	}
}
