package television.classes.objects;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCurrentChannel {

	@Test
	public void TestCurrentChannelAtInitially() {
		Television channel = new Television(1);
		int curentChannel= channel.getCurentChannel();
		assertEquals(0,curentChannel);
	}
	

	@Test
	public void TestCurrentChannelAtSecondTime() {
		Television channel = new Television(1);
		int curentChannel= channel.getCurentChannel();
		assertEquals(1,channel.getCurentChannel());
	}

}
