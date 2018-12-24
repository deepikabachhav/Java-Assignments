package com.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

/**
 * @author dbachhav
 *test class for sorting in natural order .
 */
public class TestStudents {

	@Test
	public void Test() {
		List<String> list =new ArrayList<>();
		list.add("Deepika");
		list.add("Ankita");
		list.add("Tejes");
		list.add("Shubham");
		list.add("Rohan");
		list.add("Tushar");
		/*for(String students:list)			//sorted by using forEach loop
		{
			System.out.println(students);
		}
		*/
		
		/*Collections.sort(list);		//can be sort using Collections.sort utility class.
		System.out.println(list);*/
		
		Set<String> s=new TreeSet<>(list);  	//sorted using TreeSet that maintains insertion order.
		System.out.println(s);
	}
}
