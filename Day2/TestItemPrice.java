/* Test case to find new item price after discount */

import static org.junit.Assert.*;
import org.junit.Test;
public class TestItemPrice {

	@Test
	public void TestItemPriceOne() {
		Discount discount=new Discount();
		float price= discount.checkItemPrice(500);
		assertEquals(325,price,0.5);
	}
}
