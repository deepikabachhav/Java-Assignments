/* test class for isoceles triangle */

package triangle.classesAndObjects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestForIsoscelesTriangle {

	@Test
	public void TestForIsoscelesTriangle() {
		Triangle triangle =new Triangle(3.0,4.0,4.0);
		boolean isoscelesTriangleOrNot=triangle.isIsosceles();
		assertEquals(true,isoscelesTriangleOrNot);
	}

	@Test
	public void TestForNotIsoscelesTriangle() {
		Triangle triangle =new Triangle(3.0,4.0,9.0);
		boolean isoscelesTriangleOrNot=triangle.isIsosceles();
		assertEquals(false,isoscelesTriangleOrNot);
	}
}
