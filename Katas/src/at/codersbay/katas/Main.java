package at.codersbay.katas;

public class Main {

    public static void main(String[] args) {

        System.out.println("After you finished your Kata, make sure to call it from the main class to show us what you've done!");

        // falls du eine TicTacToe klasse geschrieben hast die mit einer statischen Methode ein Tic Tac Toe feld auf die Konsole drucken kann könnte das so aussehen:
        // eg.: TicTacToe.printRandomField();
        // eg.: TicTacToe.printField("X", "", "O", "", "", "", "X", "X", "O");

        BingoCard.getCard();
        EvenOrOdd.printResult((int) ((Math.random()*99+1))); 
        
        // Validitaet der Kreditkarte ueberpruefen
        System.out.println("Die Kreditkarte wird auf gueltigkeit ueberprueft:");
        
        CreditCardValidator Manuel = new CreditCardValidator();
        
        CreditCardValidator.checkValidity(123);
                
        System.out.println("Rueckgabewert der Variable isValide: " + CreditCardValidator.isValide);
        
    }

}
