/* Test class for finding various test cases of area */

package rectangle.objects;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestRectangleShape {
	
	@Test
	public void TestPositiveLengthPositiveBreadth() {
		Rectangle rectangle = new Rectangle(10.0,10.0);
		double area= rectangle.getArea();
		assertEquals(100.0,area,0.02);
	}
	
	@Test
	public void TestPositiveBreadthNegativeLength() {
		Rectangle rectangle = new Rectangle(-10.0,10.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestNegativeBreadthNegativeLength() {
		Rectangle rectangle = new Rectangle(-10.0,-10.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestNegativeBreadthPositiveLength() {
		Rectangle rectangle = new Rectangle(10.0,-10.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestZeroBreadthZeroLength() {
		Rectangle rectangle = new Rectangle(0.0,0.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestZeroBreadthPositiveLength() {
		Rectangle rectangle = new Rectangle(10.0,0.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestPositiveBreadthZeroLength() {
		Rectangle rectangle = new Rectangle(0.0,10.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestNegativetiveBreadthZeroLength() {
		Rectangle rectangle = new Rectangle(0.0,-10.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
	
	@Test
	public void TestZeroBreadthNegativeLength() {
		Rectangle rectangle = new Rectangle(-10.0,0.0);
		double area= rectangle.getArea();
		assertEquals(0.0,area,0.02);
	}
}
