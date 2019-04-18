package com.country.america.jva.eight.find;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");

		//Finds the first one in the list
		Optional<String> optString = list.stream()
				.findFirst();					//This is a terminal operation; because it terminates the rest of the execution

		System.out.println("string: " + optString.get());
	}

}
