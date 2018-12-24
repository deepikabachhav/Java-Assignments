package com.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author dbachhav
 *Student is a class implements the methods for getting key only,getting value only, getting map.
 */
public class Student {
	public void getMap(Map <String,String> map){
		Set<Entry<String,String>> student=map.entrySet();
		for(Entry<String,String> studentMap : student){
			System.out.println(studentMap.getKey() +":");
			System.out.println(studentMap.getValue());
		}
	}
	public String getFavouriteFruitByNameOfStudent(String studentName,Map<String,String> map){
		String fruit=map.get(studentName);
		System.out.println(fruit);
		return fruit;
	}
	
	public void getKeyOnly(Map <String,String> map){
		Set<String>	keys=map.keySet();
		for(String KeySet :keys)
			System.out.println(KeySet);
	}
	
	public void getValueOnly(Map <String,String> map){
		Set<Entry<String,String>> student=map.entrySet();
		for(Entry<String,String>  values : student){
			System.out.println(values.getValue());
		}
	}
}
