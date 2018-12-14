/* Test class for Distance */

package distance.objects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestDistance {
	private Distance distance= new Distance();
	private Distance objectOne= new Distance();
	private Distance objectTwo= new Distance();

		@Test
		public void main() {
			objectOne.set(5, (float) 9.0);
			objectTwo.set(4,(float) 11.0);
			System.out.println("objectOne : "); 
			objectOne.display();
			System.out.println("objectTwo : "); 
			objectTwo.display();
			System.out.println("distance : "); 
			distance.sum(objectOne, objectTwo);
		}
}
