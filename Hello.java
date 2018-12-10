class Hello{
	static void display(){
		System.out.println("disp");
	}
	static int addition(int numberOne, int numberTwo){
		int sum= numberOne+ numberTwo;
		return sum;
	}
	static int subtraction(int numberOne, int numberTwo){
		int sub= numberOne- numberTwo;
		return sub;
	}
	static int multiplication(int numberOne, int numberTwo){
		int mul= numberOne* numberTwo;
		return mul;
	}
	static int division(int numberOne, int numberTwo){
		int div= numberOne /numberTwo;
		return div;
	}
	public static void main(String[] args){
		System.out.println("Hello world");
		display();
		int sum= addition(7,6);
		System.out.println("The addition of two numbers is:" + sum);
		int sub= subtraction(7,6);
		System.out.println("The subtraction of two numbers is:" + sub);
		int mul= multiplication(7,6);
		System.out.println("The multiplication of two numbers is:" + mul);
		int div= division(80,16);
		System.out.println("The division of two numbers is:" + div);
		}
}