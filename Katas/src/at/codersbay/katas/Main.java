package at.codersbay.katas;

public class Main {

  public static void main(String[] args) {

        CountofNumbers count = new CountofNumbers();
        count.ArrayofNumbers();


        // Durchschnitt eines Array bestimmen
        ArrayMean arrayMean = new ArrayMean();
        ArrayMean.calcArrAvg();        

        // BingoCard drucken      
        BingoCard.getCard();
        EvenOrOdd.printResult((int) ((Math.random()*99+1))); 
        
        // Validitaet der Kreditkarte ueberpruefen
        System.out.println("Die Kreditkarte wird auf gueltigkeit ueberprueft:");
        
        CreditCardValidator Manuel = new CreditCardValidator();
        
        CreditCardValidator.checkValidity(123);
                
        System.out.println("Rueckgabewert der Variable isValide: " + CreditCardValidator.isValide);
        
        // Medianwert eines Array bestimmen
        ArrayMedian_01 medianArray = new ArrayMedian_01();
        
        medianArray.arrayMedian_01();

       //leetspeak
        Leetspeak leetspeak = new Leetspeak();
        System.out.println(leetspeak.fromString("My text is long and beautiful, as, it has been well documented, " +
                "are various other parts of my website.Lorem Ispum is a choke artist. It chokes! Some people have an " +
                "ability to write placeholder text... It's an art you're basically born with. You either have it or " +
                "you don't. I think the only difference between me and the other placeholder text is that I’m more " +
                "honest and my words are more beautiful. Lorem Ipsum best not make any more threats to your website. " +
                "It will be met with fire and fury like the world has never seen.Lorem Ipsum is unattractive, both " +
                "inside and out. I fully understand why it’s former users left it for something else. They made a good " +
                "decision. Some people have an ability to write placeholder text... It's an art you're basically born " +
                "with. You either have it or you don't.I'm speaking with myself, number one, because I have a very good " +
                "brain and I've said a lot of things. My text is long and beautiful, as, it has been well documented, " +
                "are various other parts of my website."));


    }

}
