/* Test class for finding Area Of Two Rectangle Are Different or same */

package rectangle.objects;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTwoRectangleShapes {
	
	@Test
	public void TestAreaOfTwoRectangleAreDiffernt() {
		Rectangle rectangleOne=new Rectangle(15.0,20.0);
		Rectangle rectangleTwo= new Rectangle(10.0,10.0);
		double areaOne= rectangleOne.getArea();
		double areaTwo=rectangleTwo.getArea();
		assertNotEquals(areaOne,areaTwo,0.02);
	}

	@Test
	public void TestAreaOfTwoRectangleAreSame() {
		Rectangle rectangleOne=new Rectangle(10.0,3.0);
		Rectangle rectangleTwo= new Rectangle(15.0,2.0);
		double areaOne= rectangleOne.getArea();
		double areaTwo=rectangleTwo.getArea();
		assertEquals(areaOne,areaTwo,0.02);
	}
}
