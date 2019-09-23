package at.codersbay.katas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("After you finished your Kata, make sure to call it from the main class to show us what you've done!");

        // falls du eine TicTacToe klasse geschrieben hast die mit einer statischen Methode ein Tic Tac Toe feld auf die Konsole drucken kann könnte das so aussehen:
        // eg.: TicTacToe.printRandomField();
        // eg.: TicTacToe.printField("X", "", "O", "", "", "", "X", "X", "O");
        
        String tester;
        tester = "ab";
        tester = "aabab";
        tester = "abcd";
//        tester = "opqrstuvwxyzjihgfedcba";
//        tester = "abcdezyxvut";
//        tester = "678954321";
        tester = "1234";
        tester = "1337";
        tester = "a";
        tester = "ab";
        tester = "aabb";
        System.out.println(Arrays.toString(PermutationGenerator.listOfPermutations(tester)));

    }

}
