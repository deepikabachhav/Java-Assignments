/* Test class for testing increased volume of television */

package television.classes.objects;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestIncreaseVolumeOfTelevision {
	
	@Test
	public void test() {
		Television volume =new Television(1);
		int increaseVolume= volume.getIncreaseVolume();
		assertEquals(0,increaseVolume);
	}

	@Test
	public void test2() {
		Television volume =new Television(1);
		//volume.getCurrentVolume();
		int increaseVolume= volume.getIncreaseVolume();
		//volume.getCurrentVolume();
		assertEquals(1,volume.getCurrentVolume());
	}

	/*@Test
	public void test3() {
		Television volume =new Television(1);
		System.out.println("A :" +volume.getCurrentVolume());
		int increaseVolume= volume.getIncreaseVolume();
		volume.getCurrentVolume();
		assertEquals(2,volume.getCurrentVolume());
	}
*/
}
