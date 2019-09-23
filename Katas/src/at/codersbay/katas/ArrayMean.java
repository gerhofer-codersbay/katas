package at.codersbay.katas;

public  class ArrayMean {


	
	public static void main(String[] args) {
		
	
		calcArrAvg();
		

	}

	public static void calcArrAvg() {
		int meanArr[] = { 1, 66, 8, 77, 23, 44, 11, 49 };
		int sumNr = 0;
		for (int i = 0; i < meanArr.length; i++) { // errechnen der Gesamtsumme mit einer for Schleife
			sumNr = sumNr + meanArr[i];
		}
		
		int average = sumNr / meanArr.length; // errechnen des Durchschnitts der errechneten Summe

		System.out.println("The Array contains the numbers: ");
		for (int numbers : meanArr) {
			System.out.println(numbers);
		}
		System.out.println("The Sum is: "+sumNr +" and the average is: "+average);
	}
}


