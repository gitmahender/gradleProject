package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");

		//Returns true only if all the elements is matched
		boolean result = list.stream()
				.noneMatch(x->x.contains("z"));					//This is a terminal operation; because it terminates the rest of the execution

		System.out.println("noneMatch: " + result);
	}

}
