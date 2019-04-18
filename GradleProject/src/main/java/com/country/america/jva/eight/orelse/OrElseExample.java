package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OrElseExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh", "mahender", "suresh");

		Optional<String> distinct = list.stream()
				.filter(x->x.contains("z"))
				.findFirst();								//statefull intermediate operation
				

		System.out.println("orElse: " + distinct.orElse("Everything filtered"));
	}

}
