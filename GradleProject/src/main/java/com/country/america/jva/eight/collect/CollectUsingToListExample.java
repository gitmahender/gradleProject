package com.country.america.jva.eight.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectUsingToListExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh", "ramesh", "suresh");

		//Using Collectors.toList()
		list.stream()
				.filter(x -> x.contains("esh"))			//intermediate operation
				.collect(Collectors.toList())
				.forEach(System.out::println);
			}

}
