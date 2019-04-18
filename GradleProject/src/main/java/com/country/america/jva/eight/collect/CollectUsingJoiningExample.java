package com.country.america.jva.eight.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectUsingJoiningExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hello", "how", "are", "you");

		//This will count the number of elements passed in the stream
		String joinedString = list.stream()
				.collect(Collectors.joining(", "));

		System.out.println(joinedString);
	

	}

}
