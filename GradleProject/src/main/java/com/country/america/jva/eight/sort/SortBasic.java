package com.country.america.jva.eight.sort;

import java.util.Arrays;
import java.util.List;

public class SortBasic {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("ramesh", "mahender", "suresh");

		//Natural Order of sort
		list.stream()
				.sorted()
				.forEach(System.out::println);

	}

}
