import static org.junit.Assert.*;

import org.junit.Test;
public class TestOccurenceOfName {

	@Test
	public void TestNameDeepika() {
		CheckName checkName= new CheckName();
		String[] arrayOfNames={"Deepika","Ankita","Deepika","Anjali","Harshali","Rutuja","Anderson","Pooja","Deepika","Deepika","Ankita", "Taylor", "Anderson"};
		int result =checkName.IsNamePresentInArray(arrayOfNames,"Deepika");
		assertEquals(4,result);
	}

	@Test
	public void TestNameAnkita() {
		CheckName checkName= new CheckName();
		String[] arrayOfNames={"Deepika","Ankita","Deepika","Anjali","Harshali","Rutuja","Anderson","Pooja","Deepika","Deepika","Ankita", "Taylor", "Anderson"};
		int result =checkName.IsNamePresentInArray(arrayOfNames,"Ankita");
		assertEquals(2,result);
	}
	
	@Test
	public void TestNameNone() {
		CheckName checkName= new CheckName();
		String[] arrayOfNames={"Deepika","Ankita","Deepika","Anjali","Harshali","Rutuja","Anderson","Pooja","Deepika","Deepika","Ankita", "Taylor", "Anderson"};
		int result =checkName.IsNamePresentInArray(arrayOfNames,"Samidha");
		assertEquals(0,result);
	}
	
	@Test
	public void TestNameEmpty() {
		CheckName checkName= new CheckName();
		String[] arrayOfNames={"Deepika","Ankita","Deepika","Anjali","Harshali","Rutuja","Anderson","Pooja","Deepika","Deepika","Ankita", "Taylor", "Anderson"};
		int result =checkName.IsNamePresentInArray(arrayOfNames,"");
		assertEquals(0,result);
	}


}
