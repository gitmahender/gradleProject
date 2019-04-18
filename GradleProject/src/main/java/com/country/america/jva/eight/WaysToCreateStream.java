package com.country.america.jva.eight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class WaysToCreateStream {

	public static void main(String[] args) {

		// Create ArrayList of String 
		List<String> list = new ArrayList<>(); 

		// Add element in list 
		list.add("Geeks"); 
		list.add("for"); 
		list.add("Geeks"); 

		//Way 1: Collection.stream() - Stream creation from collection
		Stream<String> streamFromList = list.stream(); 


		//Way 2: Create a stream from specified values
		Stream<Integer> streamOfValues
		= Stream.of(1, 2, 
				3, 4, 
				5, 6, 
				7, 8, 
				9); 

		//Way 3: Create stream from array
		String[] arr = new String[] { "a", "b", "c" };
		Stream<String> streamOfArray = Arrays.stream(arr);

		//Way 4: stream from stream.of(array)
		Stream<String> streamOfArrayOther = Stream.of(arr); 

		//Way 5: To avoid nulls
		Stream<String> streamEmpty = Stream.empty(); 


		//Way 6: create builder, then add, then build stream
		// Create stream using Stream builder() 
		Stream.Builder<String> builder = Stream.builder(); 

		// Adding elements in the stream of Strings 
		Stream<String> stream = builder.add("a") 
				.add("b") 
				.add("c") 
				.build(); 


		//Way 7: use iterator with limit and create stream
		int inputValue = 2;
		int limit = 5;
		Stream.iterate(inputValue, 
				(Integer n) -> n * n) 
		.limit(limit) 
		.forEach(System.out::println);

		//Way 8: use generate with limit and create stream
		Stream.generate(Math::random) 
		.limit(limit) 
		.forEach(System.out::println);


		//Way 9: using pattern
		List<String> list5 
		= Arrays 
		.asList("Geeks", 
				"For", 
				"Geek", 
				"GeeksForGeeks", 
				"A Computer Portal"); 

		// Get the pattern 
		Pattern p = Pattern.compile("^G"); 

		list5.stream() 
		.filter(p.asPredicate()) 
		.forEach(System.out::println);


		//Way 10: 
		// Convert the iterator into a Spliterator
		// Get the Iterator 
		Iterator<String> iterator = Arrays 
				.asList("a", "b", "c") 
				.iterator(); 
		Spliterator<String> spitr 
		= Spliterators 
		.spliteratorUnknownSize(iterator, 
				Spliterator.NONNULL); 

		// Convert spliterator into a sequential stream 
		Stream<String> streamIterator 
		= StreamSupport.stream(spitr, false); 

		
		
		//Way 11: Using patter and split as stream
		Pattern patt = Pattern.compile(",");
		patt.splitAsStream("a,b,c")
		.forEach(System.out::println);
		
		//Way 12: The below would print out the numbers one through ten
		IntStream.range(1, 11).forEach(System.out::println);

	}

}
