/*Write the definition for a class called Complex that has floating point properties for storing real and imaginary parts. The class has the following behaviours/services/methods:
void set(float, float) to set the specified value in object
void disp() to display complex number object
complex sum() to sum two complex numbers & return complex number */

package complex.number;
public class Complex {
	private float real,imaginary;

	public float getImaginary() {
		return imaginary;
	}

	public void setImaginary(float imaginary) {
		this.imaginary = imaginary;
	}

	public void setReal(float real) {
		this.real = real;
	}
	public float getReal() {
		return real;
	}

	public void set(float real, float imaginary)
	{
		this.real= real;
		this.imaginary= imaginary;
	}
	
	public void disp(){
		System.out.println(real+ "+" + "(" + imaginary + " i" +")");
	}
	
	public Complex sum(Complex complexNumberOne,Complex complexNumberTwo) {
		Complex number=new Complex();
		number.real =complexNumberOne.real+ complexNumberTwo.real;
		number.imaginary =complexNumberOne.imaginary + complexNumberTwo.imaginary;
		number. disp();
		return number;
	}
}

