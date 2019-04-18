package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterBasicExample {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");
		
		//Filter outputs new stream
		Stream<String> newList = list.stream()
		.filter(item -> item.contains("mahender"));
		
		System.out.println("Filtered output: " + newList.count());

	}

}
