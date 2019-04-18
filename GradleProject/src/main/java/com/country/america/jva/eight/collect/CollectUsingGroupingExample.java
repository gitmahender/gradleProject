package com.country.america.jva.eight.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.country.america.model.Parent;

public class CollectUsingGroupingExample {

	public static void main(String[] args) {

		Parent parent1 = new Parent();
		parent1.setName("Raji");
		parent1.setAge(60);


		Parent parent2 = new Parent();
		parent2.setName("Raji");
		parent2.setAge(61);

		Parent parent3 = new Parent();
		parent3.setName("Prame");
		parent3.setAge(80);

		Parent parent4 = new Parent();
		parent4.setName("Raji");
		parent4.setAge(80);


		//Add to the list
		List<Parent> parents = Arrays.asList(parent1, parent2, parent3, parent4);

		//Using Collectors.toList()
		Map<String, List<Parent>> outter = parents.stream()
				.collect(Collectors.groupingBy(Parent::getName));

		outter.forEach((key,value) -> {

			System.out.println(key + value.size());
			
		});


	}

}
