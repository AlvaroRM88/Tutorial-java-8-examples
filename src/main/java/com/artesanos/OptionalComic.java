package com.artesanos;

import java.util.Optional;

public class OptionalComic {
	
	/*
	 * If we create a empty optional and try to access his value, it get a NoSuchElementException
	 */
	private static void getValueOfEmptyOptional() {
		
		Optional<?> emptyOptional = Optional.empty();
		
		System.out.println(emptyOptional.get());
		
	}
	
	/*
	 * Example how create a optional with .of()
	 * In this case the argument in .of() is null --> Throw a NullPointerException
	 */
	private static String getCollection(String collection) {
		
		Optional<String> optionalCollection = Optional.of(collection);;
		
		collection = optionalCollection.get();
		
		System.out.println(collection);
		
		return collection;
		
	}
	
	public static void main(String[] args) {
		
		String collection = "Spiderman";

		getCollection(collection);
		
		getValueOfEmptyOptional();
		
	}

}
