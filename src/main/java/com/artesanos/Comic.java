package com.artesanos;

public class Comic {
	
	/*
	 * Check if the comic is about Spiderman without checking if the argument is null.
	 * Bad practice in general.
	 */
	private static Boolean isComicSpiderman(String collection) { 
		
		return collection.contains("Spiderman");
		
	}
	
	/*
	 * Check if the comic is about Ironman checking if the argument is null.
	 * Good practice but without using the functionality of Optional
	 */
	private static Boolean isComicIronman(String collection) {
		
		Boolean isComicIronman = false;
		
		if(collection != null) 
			isComicIronman = collection.contains("Ironman");
		
		return isComicIronman;
		
	}
	
	/*
	 * Check if the comic is about Thor catching the exception
	 * Good practice depend of the circumstances
	 */
	private static Boolean isComicThor(String collection) {
		
		Boolean isComicThor = false;
		
		try {
			
			isComicThor = collection.contains("Thor");
			
		} catch(NullPointerException npe) {
			
			System.out.println("Catching the exception " + npe.getMessage());
			
		}
		
		return isComicThor;
		
	}
	

	public static void main(String[] args) {
		
		String collection = null;
		
		System.out.println("Is comic about Thor: " + isComicThor(collection));
		
		System.out.println("Is comic about Ironman: " + isComicIronman(collection));
		
		System.out.println("Is comic abotu Spiderman: " + isComicSpiderman(collection));
		
	}

}
