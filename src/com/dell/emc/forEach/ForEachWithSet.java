package com.dell.emc.forEach;

import java.util.HashSet;
import java.util.Set;

public class ForEachWithSet {

	public static void main(String[] args) {
		forEachWithSet();
	}

	public static void forEachWithSet() {

		final Set<String> items = new HashSet<>();
		items.add("A");
		items.add("B");
		items.add("C");
		items.add("D");
		items.add("E");

		// before java 8
		for (final String item : items) {
			System.out.println(item);
		}

		// java 8 with lambda expression
		// Output : A,B,C,D,E
		items.forEach(item -> System.out.println(item));

		// Output : C
		items.forEach(item -> {
			if ("C".equals(item)) {
				System.out.println(item);
			}
		});

		// method reference
		items.forEach(System.out::println);

		// Stream and filter
		items.stream().filter(s -> s.contains("B")).forEach(System.out::println);

	}

}