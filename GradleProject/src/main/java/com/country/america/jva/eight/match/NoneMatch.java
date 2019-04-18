package com.country.america.jva.eight.match;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");

		//Returns true only if all the elements is matched
		boolean result = list.stream()
				.allMatch(x->x.contains("esh"));					//This is a terminal operation; because it terminates the rest of the execution

		System.out.println("allMatch: " + result);
	}

}
