package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");

		//Returns true if atleast one element is matched
		boolean result = list.stream()
				.anyMatch(x->x.contains("esh"));					//This is a terminal operation; because it terminates the rest of the execution

		System.out.println("anyMatch: " + result);
	}

}
