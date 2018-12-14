package Employee_Assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestEmployeeName {
	private Employee employee;
		
		@Before
		public void setUp(){
			employee= new Employee();
			employee.setID(102);
		}
		
		@Test
		public void TestName() {
			String name= employee.getName("Deepika");
			assertEquals("Deepika",name);
		}
		
		@Test
		public void TestNameOne() {
			String name= employee.getName("ankita");
			assertEquals("ankita",name);
		}
	}
