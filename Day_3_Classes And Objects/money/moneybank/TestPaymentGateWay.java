/* Test class for test paymentgateway that is transfer is successful or not */

package money.moneybank;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestPaymentGateWay {
	
	@Test
	public void TestPaymentGatewaySuccessful() {
		SavingAccount savingAccountOne = new SavingAccount("Deepika", 8000.00);
		SavingAccount savingAccountTwo= new SavingAccount("Ankita", 8000.00);
		boolean transfer=PaymentGateway.transfer(savingAccountOne,savingAccountTwo,5000.00);
		assertEquals(true,transfer);
	}
	
	@Test
	public void TestPaymentGatewayNotSuccessful() {
		SavingAccount savingAccountOne = new SavingAccount("Deepika", 8000.00);
		SavingAccount savingAccountTwo= new SavingAccount("Ankita", 8000.00);
		boolean transfer=PaymentGateway.transfer(savingAccountOne,savingAccountTwo,10000.00);
		assertEquals(false,transfer);
	}
}
