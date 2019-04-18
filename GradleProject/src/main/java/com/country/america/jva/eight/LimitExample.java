package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LimitExample {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("mahender", "ramesh", "suresh", "ramesh", "suresh");

		//Mahender is not passed thru to even count as limit 1
		//ramesh is counted as 1
		//suresh is counted as 2
		//ramesh is counted as 3
		//next suresh is not counted. since we reached the max limit
		Stream<String> optString = list.stream()
				.filter(x -> x.contains("esh"))			//intermediate operation
				.limit(3);
				

		System.out.println("using limit 3, so expecting only 3 results : " + optString.count());
	}

}
