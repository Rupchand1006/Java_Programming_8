package com.dell.emc.forEach;

import java.util.ArrayList;
import java.util.List;

public class Without8ForEach {

	public static void main(String[] args) {
		forEachWithList();
	}

	public static void forEachWithList() {

		final List<Person> items = new ArrayList<>();
		items.add(new Person(100, "Ramesh"));
		items.add(new Person(100, "A"));
		items.add(new Person(100, "B"));
		items.add(new Person(100, "C"));
		items.add(new Person(100, "D"));

		for (final Person item : items) {
			System.out.println(item.getName());
		}

		items.forEach(item -> System.out.print(item.getName()));

		items.forEach(item -> {
			if ("C".equals(item.getName())) {
				System.out.println("********************");
				System.out.println(item.getName());
			}
		});
		
		
		//method reference
		
		items.forEach(System.out::println);
		
		  items.stream()
	        .filter(s -> s.getName().equals("Ramesh"))
	        .forEach(System.out::println);

	}
}
