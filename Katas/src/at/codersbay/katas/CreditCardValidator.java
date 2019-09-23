/*
 * Project codersbay basics.
 * @Version 1.0
 * Copyright Manuel Punzet 2019, manuel.punzet@gmx.net.
 */
package at.codersbay.katas;

/**
 * Diese Klasse enhaelt den Konstruktor CreditCardValidator und die Methode checkValidity
 *
 */
public class CreditCardValidator {

    static String name = "Manuel Punzet";
    static String address = "Brucknerplatz 4";
    int zipCode = 4063;
    String city = "Hoersching";
    static boolean isValide;
    String savedCreditCardNumber = "4931 3231 4798 1276";
    static int saved_ccv = 123;
    String creditCardNumber;
    
    
    public void CreditCardValidator(int ccv) {

        this.name = name;
        this.address = address;
        this.zipCode = zipCode;
        this.city = city;
        String creditCardnumber = creditCardNumber;

        
    }

    public static boolean checkValidity(int ccv) {

        if (saved_ccv == ccv) {

            isValide = true;
            System.out.println("Die Kreditkarte auf " + name + " ist gueltig.");
        } else {
            System.out.println("Die Kreditkarte auf " + name + " ist NICHT gueltig.");
            isValide = false;
        }

        return isValide;
    }

}
