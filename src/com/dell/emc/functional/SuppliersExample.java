package com.dell.emc.functional;

import java.util.function.Supplier;

public class SuppliersExample {

	public static void main(String[] args) {

		Supplier<Person> supplier = () -> {
			return new Person("Rupchand", 30);
		};

		Person p = supplier.get();
		System.out.println("Person Detail:\n" + p.getName() + ", " + p.getAge());
	}
}