package com.collection;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

	public class TestBasicCollection {

		@Test
		public void TestLaptop() {
			Set<Laptop> set =new HashSet<>();
			set.add(new Laptop("hp",120,"windows","64-bit"));
			set.add(new Laptop("Dell",120,"Unix","32-bit"));
			set.add(new Laptop("Apple",120,"Mac","128-bit"));
			/*for(Laptop laptop: set)
			{ System.out.println(laptop);}
			//set.toString();
*/		}
		
		@Test
		public void TestTelevision() {
			Set<Television> set =new HashSet<>();
			set.add(new Television("Sony","LED",false,70000));
			set.add(new Television("LG","LCD",false,65000));
			set.add(new Television("Samsung","Plasma",true,100000));
			//System.out.println(set.toString());
		}
		
		@Test
		public void TestCellPhone() {
			Set<CellPhone> set =new HashSet<>();
			set.add(new CellPhone("Samsung","Sdous2","2GB intenal","Lolipop",7000));
			set.add(new CellPhone("Redmi","RedmiNote5Pro","4GB intenal","Oreo",14000));
			set.add(new CellPhone("Lenovo","LenovoNote4","3GB intenal","Marshmallow",10000));
			set.toString();
		}
						
		@Test
		public void TestCar() {
			Set<Car> set =new HashSet<>();
			set.add(new Car("Maruti","i10",1995,150000));
			set.add(new Car("hyundai","santro",1999,350000));
			set.add(new Car("Maruti","Swift",2012,900000));
			set.toString();
		}

		@Test
		public void TestSchool() {
			Set<School> set =new HashSet<>();
			set.add(new School("R.B.H.kanya vidylay","malegaon","Nasik",1));
			set.add(new School("S.M.V school","pune","pune",2));
			set.add(new School("Snt. Miraj school","airoli","Mumbai",1));
			set.toString();
		}
}

