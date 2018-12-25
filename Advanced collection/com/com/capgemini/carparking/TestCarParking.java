package com.capgemini.carparking;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class TestCarParking {

	@Test
	public void test() {
		List<ParkedCarOwnerDetails> list= new ArrayList<>();
		ParkedCarOwnerDetails carOwnerOne=new ParkedCarOwnerDetails("Deepika","swiftDezire","MH 41 NB 4104","837801938658","Malegaon,nasik");
		ParkedCarOwnerDetails carOwnerTwo=new ParkedCarOwnerDetails("Ankita","Duster","MH 15 NS 5604","875685198652","Pune");
		ParkedCarOwnerDetails carOwnerThree=new ParkedCarOwnerDetails("Rashmi","Honda City","MH 43 kB 8652","962541356964","Mumbai");
		ParkedCarOwnerDetails carOwnerFour=new ParkedCarOwnerDetails("Deepika","Audi","MH 09 LK 9856","845682188235","Goa");
		list.add(carOwnerOne);
		list.add(carOwnerTwo);
		list.add(carOwnerThree);
		list.add(carOwnerFour);
		
		Map<Integer,ParkedCarOwnerDetails> map= new HashMap<> ();
		map.put(1,carOwnerOne);
	}

}
