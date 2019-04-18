package com.country.america.jva.eight.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectUsingCountingExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5);

		//This will count the number of elements passed in the stream
		long totalCount = list.stream()
				.collect(Collectors.counting());
		
		System.out.println(totalCount);
		
			}

}
