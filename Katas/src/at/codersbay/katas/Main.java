package at.codersbay.katas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("After you finished your Kata, make sure to call it from the main class to show us what you've done!");

        // falls du eine TicTacToe klasse geschrieben hast die mit einer statischen Methode ein Tic Tac Toe feld auf die Konsole drucken kann könnte das so aussehen:
        // eg.: TicTacToe.printRandomField();
        // eg.: TicTacToe.printField("X", "", "O", "", "", "", "X", "X", "O");
        
        System.out.println();
        System.out.println("Permutation generator: takes a string and generates all possible permutations, "
        		+ "removing duplicates.");
        System.out.println("from https://www.codewars.com/kata/5254ca2719453dcc0b00027d");
        String[] testPermutationGenerator = {"a","ab","abba","1234","1337"};
        for (String testString : testPermutationGenerator) {
			System.out.println("testing with \"" + testString + "\"...");
			System.out.println(Arrays.toString(PermutationGenerator.listOfPermutations(testString)));
		}
        System.out.println();

    }

}
