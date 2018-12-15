package television.classes.objects;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVolumeOfTelevision {

	@Test
	public void test() {
		Television volume =new Television(1);
		int currentVolume= volume.getCurrentVolume();
		assertEquals(0,currentVolume);
	}
	

	@Test
	public void testOne() {
		Television volume =new Television(1);
		int currentVolume= volume.getCurrentVolume();
		assertEquals(0,volume.getCurrentVolume());
	}

}
