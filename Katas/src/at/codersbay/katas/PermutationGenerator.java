package at.codersbay.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author  Hannes Alkin
 * @version 
 * @since   23.09.2019

 */
public class PermutationGenerator {
	
	/**
	 * 
	 * @param input the string to be permutated
	 * @return the permutations in an array
	 */
	public static String[] listOfPermutations(String input) {
		
		char[] chars = input.toCharArray();
		Arrays.sort(chars);

		List<String> permutationsAsList = new ArrayList<String>();
		boolean newOneFound;
		do {
			permutationsAsList.add(new String(chars));
			newOneFound = nextPermutation(chars);
		} while (newOneFound);
		
		String[] result = permutationsAsList.toArray(new String[permutationsAsList.size()]);
		
		return result;
		
	}
	
	public static String getNextPermutation(String input) {
		char[] chars = input.toCharArray();
		nextPermutation(chars);
		String result = new String(chars);
		return result;
	}
	
	private static boolean nextPermutation(char[] chars) {
		
		boolean found = false;
		
		int pos;
		for (pos = chars.length-1; pos > 0; pos--) {
			if (chars[pos-1] < chars[pos]) {
				found = true;
				break;
			}
		}

		if (found) {
			
			char placeholder;
			int left;
			int right;
			
			// reverse everything from input[pos] to the end
			// https://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-java
			left = pos;
			right = chars.length - 1;
			while (left < right) {
				placeholder = chars[left];
				chars[left] = chars[right];
				chars[right] = placeholder;
				left++;
				right--;
			}
			
			/*
			 * Search from input[pos] to the end until you find an element bigger than input[pos-1].
			 * Swap this element with input[pos].
			 */
			left = pos - 1;
			right = pos;
			while (chars[left] >= chars[right]) {
				right++;
			}
			placeholder = chars[left];
			chars[left] = chars[right];
			chars[right] = placeholder;
			
		}
		
		return found;
	}

}
