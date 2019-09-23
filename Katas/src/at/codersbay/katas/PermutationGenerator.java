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
	
	public static String[] listOfPermutations(String input) {
		
		 
		
//		System.out.println(input);
		char[] chars = input.toCharArray();
//		chars = Arrays.sort(chars);
//		char[] chars = Arrays.sort(input.toCharArray());
		// first permutation is the sorted array.
		Arrays.sort(chars);
		System.out.println(Arrays.toString(chars));
		
		List<String> permutationsAsList = new ArrayList<String>();
		
		// how to convert back to a String
		String first = new String(chars);
//		char[] secondAsChars = nextPermutation(chars);
//		String second = new String(secondAsChars);
		
		
		
//		String first = String.copyValueOf(chars);
//		permutationsAsList.add(first);
//		permutationsAsList.add(second);
		
		// once the permutation generator is in place, 
		// loop through permutations as long as perm(i) != i
		// and fill the list
		char[] previous;
		do {
			permutationsAsList.add(new String(chars));
			previous = chars;
			chars = nextPermutation(previous);
		} while (!Arrays.equals(chars, previous));
// 		char[] nextOne = nextPermutation(chars);
//		while (!Arrays.equals(chars, nextOne)) {
//			permutationsAsList.add(new String(nextOne));
//			chars = nextOne;
//			nextOne = nextPermutation(chars);
//		}
		
//		String[] result =  permutationsAsList.toArray();
		String[] result = permutationsAsList.toArray(new String[permutationsAsList.size()]);
		
		return result;
	}
	
	private static char[] nextPermutation(char[] input) {
		
		char[] result = Arrays.copyOf(input,input.length);
		
		System.out.println("generating next permutation...");
//		input = new char[] {'d','u'};
//		System.out.println(input);

		// find the last pair where input[pos-1] < input[pos]
		boolean found = false;
		int pos;
		for (pos = result.length-1; pos > 0; pos--) {
//			System.out.println(input[pos]);
			if (result[pos-1] < result[pos]) {
				found = true;
				break;
			}
		}
//		System.out.println("position of find: " + pos);
		
		if (found) {
			char placeholder;
			
			
			
			// reverse everything from input[pos] to the end
			
			System.out.println("reversing: " + Arrays.toString(result));
			
			int left = pos;
			int right = result.length - 1;
			
			while (left < right) {
				System.out.println(left + " -> " + result[left] + ", " + right + " -> " + result[right]);
				placeholder = result[left];
				result[left] = result[right];
				result[right] = placeholder;
				left++;
				right--;
			}
			System.out.println("reversed array: " + Arrays.toString(result));
			
			// find the smallest element bigger than input[pos-1] and swap it with input[pos-1]
			
			System.out.println("swapping elements...");
			
			left = pos - 1;
			right = pos;
			
			while (result[left] >= result[right]) {
				System.out.println("comparing " + result[left] + " with " + result[right]);
				right++;
			}
			placeholder = result[left];
			result[left] = result[right];
			result[right] = placeholder;
			
			
			}
		
		
		return result;
	}
	
	

}
