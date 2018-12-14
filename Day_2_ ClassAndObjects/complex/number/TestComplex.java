/* Write a ComplexTest class with main function to create three complex number objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all complex numbers. */

package complex.number;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestComplex {
	private Complex complexNumberOne= new Complex();
	private Complex complexNumberTwo= new Complex();
	private Complex result= new Complex();

	@Test
	public void main() {
		complexNumberOne.set(10, 20);
		complexNumberTwo.set(21,62);
		System.out.println("complexNumberOne : "); 
		complexNumberOne.disp();
		System.out.println("complexNumberTwo : "); 
		complexNumberTwo.disp();
		System.out.println("Result : "); 
		result.sum(complexNumberOne, complexNumberTwo);
	}
}
