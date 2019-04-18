package com.country.america.jva.eight.minandmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,0,2);

		//uses comparator to arrange them in order and get us the min value
		Optional<Integer> max = list.stream()
				.min(Comparator.naturalOrder());						//terminal operation
				

		System.out.println("min: " + max.get());
	}

}
