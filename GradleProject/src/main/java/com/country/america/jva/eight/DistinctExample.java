package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DistinctExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh", "mahender", "suresh");

		Stream<String> distinct = list.stream()
				.distinct();								//statefull intermediate operation
				

		System.out.println("count: " + distinct.count());
	}

}
