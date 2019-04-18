package com.country.america.jva.eight.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.country.america.model.Parent;

public class CustomSortMethodReferenceMultiCondition {

	public static void main(String[] args) {

		Parent parent1 = new Parent();
		parent1.setName("Suresh");
		parent1.setAge(62);

		Parent parent2 = new Parent();
		parent2.setName("Raji");
		parent2.setAge(62);
		
		Parent parent3 = new Parent();
		parent3.setName("Raji");
		parent3.setAge(61);

		//Add to the list
		List<Parent> parents = Arrays.asList(parent1, parent2, parent3);
		

		//Natural Order of sort
		parents.stream()
		.sorted(Comparator.comparing(Parent::getName).thenComparing(Comparator.comparing(Parent::getAge)))
		//.collect(Collectors.toList())
		.forEach(x-> System.out.println(x.getName() + "," + x.getAge()));
	}

}
