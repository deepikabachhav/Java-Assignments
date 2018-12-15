package television.classes.objects;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestfTelevisionState {
	
	@Test
	public void TestTelevisionOn() {
		Television state= new Television(1);
		boolean on=state.getState();
		assertEquals(true,on);
	}
	
	@Test
	public void TestTelevisionOff() {
		Television state= new Television(0);
		boolean off=state.getState();
		assertEquals(false,off);
	}
		
		/*Television volume =new Television();
		int cuurentVolume= volume.getCurrentVolume();
		int increaseAndDecreaseVolume= volume.getincreaseAndDecreaseVolume();
		Television channel = new Television();
		int curentChannel= channel.getCurentChannel();
		int changeChannel=channel.getChangeChannel();
		*/
	}



