package at.codersbay.katas;

/**
 * the Class OddOrEven.
 * 
 * content:
 * 
 * copyright: 2019 mario oberwalder
 * 
 * contact: mario.oberwalder@gmail.com
 */
public class OddOrEven {

	/**
	 * Prints the intro.
	 */
	public static void printIntro() {
		System.out.println("OddOrEven.printResult() returns "
				+ "true when the parameter is Odd "
				+ "and false when the Parameter Even"
				+ "\nThere is also a text output via sysout");
		
	}

	
	
	/**
	 * Prints the result.
	 *
	 *takes an integer as parameter, returns true if i is Odd
	 *also lets the user know via sysout
	 *
	 * @param i the i
	 * @return true, if i is Odd
	 */
	public static boolean printResult(int i) {
		System.out.print("The integer "+i+" is ");
		if (i%2 == 0) {
			System.out.println("Even!");
			return false;
		} else {
			System.out.println("Odd!");
			return true;
		}
	
	}

}
