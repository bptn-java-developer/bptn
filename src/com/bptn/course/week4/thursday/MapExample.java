package com.bptn.course.week4.thursday;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		// Create a map (declare the map variable 
		// and allocate memory for the map).
		Map<Integer,String> map = new TreeMap<>();
		
		
		// Add 3 entries to the map.
		// Map doesn't keep the insertion order 
		// LinkedHashMap keeps the insertion order
		// TreeMap sorts the map by key.
		map.put(1, "John");
		map.put(3, "Nick");
		map.put(2, "Jane");
		
		System.out.println("The map size is: " + map.size());
		
		System.out.println("Key 2: " + map.get(2));
		System.out.println("Key 5: " + map.get(5));

		// If we put an existing key into the map, it will replace 
		// the old value with the new value.
		map.put(2, "Lily");
		System.out.println("Key 2: " + map.get(2));
		
		//map.remove(3);
		
		
		if ( !map.containsKey(2) ) {
			map.put(2, "Hello");
		}
		
		map.putIfAbsent(2, "Hello");
		
		for ( Entry<Integer,String> e: map.entrySet() ) {
			System.out.println("k: " + e.getKey() + ", v: " + e.getValue());
		}
		
		map.clear();
		
		map.forEach((a,b) -> System.out.println("Key = " + a + ", Value = " + b));

		System.out.println("The map size is: " + map.size());
	}

}
