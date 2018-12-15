package dateAssignment.classesAndObject;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDate {

	@Test
	public void test() {
		Date date=new Date(15,02,1996);
		Date dateTwo=new Date(16,06,1995);
		String dateOne= date.toString();
		boolean smallDate=dateTwo.isSmaller(date);
		int[] diference= dateTwo.difference(date);
		System.out.println("datetwo:" +dateTwo.isSmaller(date));
	}

}
