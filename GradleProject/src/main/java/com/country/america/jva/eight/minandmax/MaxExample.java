package com.country.america.jva.eight.minandmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,3,2);

		//uses comparator to arrange them in order and get us the max value
		Optional<Integer> max = list.stream()
				.max(Comparator.naturalOrder());						//terminal operation
				

		System.out.println("max: " + max.get());
	}

}
