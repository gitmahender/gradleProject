package com.country.america.jva.eight.map;

import java.util.Arrays;
import java.util.List;

public class MapToIntExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "3");

		list.stream()
				.mapToInt(Integer::valueOf)
				.forEach(System.out::println);;

	}

}
