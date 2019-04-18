package com.country.america.jva.eight.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.country.america.model.Child;
import com.country.america.model.Parent;

public class CollectUsingToMapExample {

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
		//child2.setName("Mahender");
		child2.setAge(40);
		parent2.setChild(child2);
		
		
		//Add to the list
		List<Parent> parents = Arrays.asList(parent1, parent2);

		//Using Collectors.toList()
		parents.stream()
				.collect(Collectors.toMap(Parent::getName, Parent::getAge))
				.forEach((x,y) -> System.out.println("key: " + x + ", value: " + y));
			}

}
