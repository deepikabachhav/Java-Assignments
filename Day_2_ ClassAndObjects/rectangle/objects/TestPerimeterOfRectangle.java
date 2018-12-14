/* Test case to test the perimeter of thhe rectangle */

package rectangle.objects;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class TestPerimeterOfRectangle {

	@Test
	public void TestPositiveLengthPositiveBreadth() {
		Rectangle rectangle = new Rectangle(10.0,10.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(40.0,perimeter,0.02);
	}
	
	@Test
	public void TestPositiveBreadthNegativeLength() {
		Rectangle rectangle = new Rectangle(-10.0,10.0);
		double perimeter = rectangle.getPerimeter();
		assertEquals(0.0,perimeter,0.02);
	}
	
	@Test
	public void TestNegativeBreadthNegativeLength() {
		Rectangle rectangle = new Rectangle(-10.0,-10.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(0.0,perimeter,0.02);
	}
	
	@Test
	public void TestNegativeBreadthPositiveLength() {
		Rectangle rectangle = new Rectangle(10.0,-10.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(0.0,perimeter,0.02);
	}
	
	@Test
	public void TestZeroBreadthZeroLength() {
		Rectangle rectangle = new Rectangle(0.0,0.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(0.0,perimeter,0.02);
	}
	
	@Test
	public void TestZeroBreadthPositiveLength() {
		Rectangle rectangle = new Rectangle(10.0,0.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(20.0,perimeter,0.02);
	}
	
	@Test
	public void TestPositiveBreadthZeroLength() {
		Rectangle rectangle = new Rectangle(0.0,10.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(20.0,perimeter,0.02);
	}
	
	@Test
	public void TestNegativetiveBreadthZeroLength() {
		Rectangle rectangle = new Rectangle(0.0,-10.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(0.0,perimeter,0.02);
	}
	
	@Test
	public void TestZeroBreadthNegativeLength() {
		Rectangle rectangle = new Rectangle(-10.0,0.0);
		double perimeter= rectangle.getPerimeter();
		assertEquals(0.0,perimeter,0.02);
	}

}
