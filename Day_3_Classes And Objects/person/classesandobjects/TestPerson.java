/* main() method for person class */

package person.classesandobjects;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.Period;
import org.junit.Test;
public class TestPerson {

	@Test
	public void main() {
		Person person=new Person("Deepika",30,8,1996);
		LocalDate birthdate=LocalDate.of(1996, 8, 30);
		LocalDate now=LocalDate.now();
		Period diff=Period.between(birthdate, now);
		person.display(diff);
		
		Person personOne =new Person("Ankita",23,10,1995);
		LocalDate birthdateOne=LocalDate.of(1995, 10, 23);
		LocalDate nowOne=LocalDate.now();
		Period diffOne=Period.between(birthdateOne, nowOne);
		personOne.display(diffOne);

	}
}


