package com.dell.emc.forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ForEachWithMap {
	public static void main(String[] args) {
		forEachWithMap();
	}

	public static void forEachWithMap() {

		// Before Java 8, how to loop map
		final Map<Integer, Person> map = new HashMap<>();
		map.put(1, new Person(100, "Ramesh"));
		map.put(2, new Person(100, "Ram"));
		map.put(3, new Person(100, "Prakash"));
		map.put(4, new Person(100, "Amir"));
		map.put(5, new Person(100, "Sharuk"));

		for (final Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getName());
		}
		
		
	//  In Java 8, you can loop a Map with forEach + lambda expression.
	    map.forEach((k, p) -> {
	        System.out.println(k);
	        System.out.println(p.getName());
	    });
	}
}
