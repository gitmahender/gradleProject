package com.country.america.jva.eight.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapBasicExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh");

		//map will convert one object form to other form of object
		//Like person to string {person::getName}
		Stream<String> newList = list.stream()
				.map(item -> item.toUpperCase());

		System.out.println("Map basic output: " + newList.findFirst());
	}

}
