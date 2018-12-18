/* Test class for two person details and age difference */

package person.classesandobjects;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import org.junit.Test;
public class TestClassForAgeDifferenceOfTwoPersons {

	@Test
	public void TestOlderPerson() {
		Person persons[]=new Person[2];
		persons[0]=new Person("Deepika",30,8,1996);
		LocalDate birthdate=LocalDate.of(1996, 8, 30);		//class for calculating age in days ,months and years
		LocalDate now=LocalDate.now();
		Period diff=Period.between(birthdate, now);			
		persons[0].display(diff);
		
		persons[1] =new Person("Ankita",23,10,1995);
		LocalDate birthdateOne=LocalDate.of(1995, 10, 23);
		LocalDate nowOne=LocalDate.now();
		Period diffOne=Period.between(birthdateOne, nowOne);
		persons[1].display(diffOne);
		
		int[] difference1=persons[0].difference(persons[1]);
		assertEquals(7,difference1[0]);   	//age difference of two persons in number of days.
		assertEquals(2,difference1[1]);		//age difference of two persons in number of months.
		assertEquals(1,difference1[2]);		//age difference of two persons in number of years.

	}
}
