package at.codersbay.katas;

public class Main {

    public static void main(String[] args) {

        System.out.println("Die Kreditkarte wird auf gueltigkeit ueberprueft:");

        String creditCardNumber = "4931 3231 4798 1276";
        
        CreditCardValidator Manuel = new CreditCardValidator();
        
        CreditCardValidator.checkValidity(123);
        
        
        System.out.println("Rueckgabewert der Variable isValide: " + CreditCardValidator.isValide);
        
        
        
    }

}
