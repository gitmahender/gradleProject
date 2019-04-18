package com.country.america.jva.eight.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {

	public static void main(String[] args) {

		List<String> list1 = Arrays.asList("India", "Srilanka", "Bangladesh");
		
		List<String> list2 = Arrays.asList("USA", "China", "Europe");
		
		List<List<String>> listOfList = Arrays.asList(list1, list2);

		//flatMap will flatten the multiple nested list into one flat list
		List<String> newList = listOfList.stream()
				.flatMap(innerList -> innerList.stream())
				.collect(Collectors.toList());

		System.out.println("expecting size of 6: " + newList.size());
	}

}
