/*
 * Copyright (c) Delta
 * Datum: 18.09.2019
 * Kontakt: christian.delta@gmx.net
 * 
 * Information of the type-definition.
 * "I" in front of the name stands for Interface
 * "C" in front of the name stands for Class
 */
package at.codersbay.katas;

import java.util.Random;

public class BingoCard {
	
	private static int[] rowB;
	private static int[] rowI;
	private static int[] rowN;
	private static int[] rowG;
	private static int[] rowO;

	/**
	 * Generate a new bingo card with random numbers.
	 */
	public static void getCard()
	{
		rowB = new int[5];
		rowI = new int[5];
		rowN = new int[5];
		rowG = new int[5];
		rowO = new int[5];
		
		
		for (int i = 0; i < rowB.length; i++) {
			rowB[i] = placeRandomNumber(rowB, i+1, getRandomNumberInRange(1, 15), 1, 15);
		}   
		
		for (int i = 0; i < rowI.length; i++) {
			rowI[i] = placeRandomNumber(rowI, i+1, getRandomNumberInRange(16, 30), 16, 30);
		}   
		
		for (int i = 0; i < rowN.length; i++) {
			rowN[i] = placeRandomNumber(rowN, i+1, getRandomNumberInRange(31, 45), 31, 45);
		}   
		
		for (int i = 0; i < rowG.length; i++) {
			rowG[i] = placeRandomNumber(rowG, i+1, getRandomNumberInRange(46, 60), 46, 60);
		}   
		
		for (int i = 0; i < rowO.length; i++) {
			rowO[i] = placeRandomNumber(rowO, i+1, getRandomNumberInRange(61, 75), 61, 75);
		}   
			
		System.out.printf("%2s ", "B");
		System.out.printf("%2s ", "I");
		System.out.printf("%2s ", "N");
		System.out.printf("%2s ", "G");
		System.out.printf("%2s", "O");
		System.out.printf("\n");
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("%2s ", rowB[i]);
			System.out.printf("%2s ", rowI[i]);
			System.out.printf("%2s ", rowN[i]);
			System.out.printf("%2s ", rowG[i]);
			System.out.printf("%2s", rowO[i]);
			System.out.printf("\n");
		}
		
	}
	

	/**
	 * Generate a random number with the given range
	 * @param min the min value
	 * @param max the max value
	 * @return a number between min and max
	 */
	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	

	/**
	 * Place a number and checks if the number previosly exists (to make sure so we dont have any dupliactes)
 	 * @param row the array to check
	 * @param pos the current position in the array
	 * @param number the number to confirm
	 * @param min min value
	 * @param max max value
	 * @return the number with will be unique
	 */
	private static int placeRandomNumber(int[] row, int pos, int number, int min, int max)
	{
		for (int i = 0; i < pos-1; i++) {
				
			if(row[i] == number)
				{	
					return placeRandomNumber(row, i+1, getRandomNumberInRange(min, max), min, max);
				}			
		}
		return number;
	}	
}
