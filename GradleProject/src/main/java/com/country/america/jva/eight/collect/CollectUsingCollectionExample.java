package com.country.america.jva.eight.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectUsingCollectionExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a1","a2","b1","b2","c");

		//This will count the number of elements passed in the stream
		Collection<String> totalCount = list.stream()
				.collect(Collectors.toCollection(ArrayList::new));
		
		
		//This will count the number of elements passed in the stream
				Collection<String> asds = list.stream()
						.collect(Collectors.toCollection(TreeSet::new));
				
			}

}
