/* Test class for scelene triangle*/

package triangle.classesAndObjects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestForSceleneTriangle {

	@Test
	public void TestForSceleneTriangle() {
		Triangle triangle =new Triangle(3.0,4.0,6.0);
		boolean sceleneTriangleOrNot=triangle.isScalene();
		assertEquals(true,sceleneTriangleOrNot);
	}
	
	@Test
	public void TestForNotSceleneTriangle() {
		Triangle triangle =new Triangle(3.0,4.0,4.0);
		boolean sceleneTriangleOrNot=triangle.isScalene();
		assertEquals(false,sceleneTriangleOrNot);
	}
}
