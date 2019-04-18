package com.country.america.jva.eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.country.america.model.Child;
import com.country.america.model.Parent;

public class MapObject2ObjectExample {

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
		
		//map: loop thru stream, for each parent object get the child and create a new stream of child object
		Stream<Child> children = parentStream.map(Parent::getChild);
		
		//again, do a map on child object to string name
		Stream<String> names = children.map(Child::getName);
		
		names.forEach(System.out::println);
		
		

	}

}
