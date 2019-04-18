package com.country.america.jva.eight.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.country.america.model.Child;
import com.country.america.model.Parent;

public class MapObject2StringExample {

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
		
		
		//Create a stream first
		Stream<Parent> parentStream = parents.stream();
		
		//map: loop thru stream, for each parent object get the names and create a new stream of strings(names)
		Stream<String> names = parentStream.map(Parent::getName);
		
		//loop and print
		names.forEach(System.out::println);
		
		

	}

}
