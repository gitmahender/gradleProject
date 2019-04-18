package com.country.america.jva.eight.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.country.america.model.Child;
import com.country.america.model.Parent;

public class CustomSortComparatorExplictDefined {

	public static void main(String[] args) {

		Parent parent1 = new Parent();
		parent1.setName("Raji");
		parent1.setAge(60);

		Child child1 = new Child();
		child1.setName("Mahender");
		child1.setAge(30);
		parent1.setChild(child1);

		Parent parent2 = new Parent();
		parent2.setName("Prame");
		parent2.setAge(80);

		Child child2 = new Child();
		child2.setName("Sand");
		child2.setAge(40);
		parent2.setChild(child2);


		//Add to the list
		List<Parent> parents = Arrays.asList(parent1, parent2);
		
		 Comparator<Parent> comparator= (o1, o2) -> o1.getName().compareTo(o2.getName());

		//Natural Order of sort
		parents.stream()
		.sorted(comparator)
		//.collect(Collectors.toList())
		.forEach(x-> System.out.println(x.getName()));
	}

}
