package com.collection;
import java.util.TreeSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;
import com.collection.Car;
/**
 * @author dbachhav
 * Test class for testing 
 */
public class TestCarOne {

	@Test
	public void test() {
		Set <CarOne> set= new TreeSet<CarOne>();
		set.add(new CarOne("Maruti","i10",1995,150000));
		set.add(new CarOne("hyundai","santro",1999,350000));
		set.add(new CarOne("Maruti","Swift",2012,900000));}
		
}
