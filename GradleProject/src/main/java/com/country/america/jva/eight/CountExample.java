package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;

public class CountExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");

		//This returns any first element in its order of execution
		//This does not return list, but only one element
		//This is a short-circuit operation because it just needs �any� first element to be returned and terminate the rest of the iteration.
		//The behavior of Stream findAny() operation is explicitly non-deterministic i.e, it is free to select any element in the stream. 
		//Multiple invocations on the same source may not return the same result.
		long count = list.stream()
				.filter(x -> x.contains("esh"))			//intermediate operation
				.count();								//terminal operation
				

		System.out.println("count: " + count);
	}

}
