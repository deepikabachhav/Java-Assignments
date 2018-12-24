package com.collection;
import java.util.HashMap;
import java.util.Set;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Map;
public class TestMap {

	@Test
	public void TestMap() {
		Student student =new Student();
		Map<String,String> map= new HashMap<String,String>();
		map.put("Deepika","Mango");
		map.put("Ankita","Orange");
		map.put("Harshali","Banana");
		map.put("Rashmi","Kiwi");
		map.put("pooja","Apple");
		Map<String, String> getMap=(map);
		String answer=student.getFavouriteFruitByNameOfStudent("Deepika", map);
		student.getKeyOnly(map);
		student.getValueOnly(map);
	}
}	 

