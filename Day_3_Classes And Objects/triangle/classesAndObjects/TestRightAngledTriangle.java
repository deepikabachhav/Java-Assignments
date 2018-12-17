/* Test class for right Angled triangle*/

package triangle.classesAndObjects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestRightAngledTriangle {

	@Test
	public void TestForRightAngledTriangle() {
		Triangle triangle =new Triangle(3.0,4.0,5.0);
		boolean rightTriangleOrNot=triangle.isRight();
		assertEquals(true,rightTriangleOrNot);
	}
	
	@Test
	public void TestForNotRightAngledTriangle() {
		Triangle triangle =new Triangle(3.0,4.0,8.0);
		boolean rightTriangleOrNot=triangle.isRight();
		assertEquals(false,rightTriangleOrNot);
	}
}
