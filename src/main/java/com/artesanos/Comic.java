package com.artesanos;

public class Comic {
	
	/*
	 * Check if the comic is about Spiderman without checking if the argument is null.
	 * Bad practice in general.
	 */
	private static boolean isComicSpiderman(String collection) { 
		
		return collection.contains("Spiderman");
		
	}
	
	/*
	 * Check if the comic is about Ironman without checking if the argument is null.
	 * Good practice, but without using the functionality of Optional
	 */
	private static boolean isComicIronman(String collection) {
		
		boolean isComicIronman = false;
		
		if(collection != null) 
			isComicIronman = collection.contains("Ironman");
		
		return isComicIronman;
		
	}
	

	public static void main(String[] args) {
		
		String stringNull = null;
		
		System.out.println("Is comic Ironman: " + isComicIronman(stringNull));
		
		System.out.println("Is comic Spiderman: " + isComicSpiderman(stringNull));
		
		
		

	}

}
