/* Test Time class and main() function for setTime And dispaly sum of time*/

package time.objects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestTime {
	private Time time= new Time();
	private Time objectOne= new Time();
	private Time objectTwo= new Time();
	
	@Test
	public void main() {
		objectOne.setTime(5,30);
		objectTwo.setTime(4,40);
		System.out.println("objectOne : "); 
		objectOne.showTime();
		System.out.println("objectTwo : "); 
		objectTwo.showTime();
		System.out.println("Time : "); 
		time.sum(objectOne, objectTwo);
	}
}
