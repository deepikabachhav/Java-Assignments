/* test class for Equilateral Triangle */

package triangle.classesAndObjects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestForEquilateralTriangle {

	@Test
	public void TestForEquilateralTriangle() {
		Triangle triangle =new Triangle(4.0,4.0,4.0);
		boolean equilateralTriangleOrNot=triangle.isEquilateral();
		assertEquals(true,equilateralTriangleOrNot);
	}
	
	@Test
	public void TestForNotEquilateralTriangle() {
		Triangle triangle =new Triangle(4.0,2.0,4.0);
		boolean equilateralTriangleOrNot=triangle.isEquilateral();
		assertEquals(false,equilateralTriangleOrNot);
	}
}
