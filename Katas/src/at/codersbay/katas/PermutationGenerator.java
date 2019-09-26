package at.codersbay.katas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Hannes Alkin
 * @version
 * @since 23.09.2019
 */
public class PermutationGenerator {

	/**
	 * Takes a string and generates an array containing all its permutations.
	 * 
	 * @param input the string to be permutated
	 * @return the permutations in an array
	 */
	public static String[] listOfPermutations(String input) {

		/*
		 * Set up a list to be filled with the results
		 */
		List<String> permutationsAsList = new ArrayList<String>();

		/*
		 * Convert the string to a character array and sort it. The sorted array is the
		 * first permutation in lexicographical order (order of ascii values).
		 */
		char[] chars = input.toCharArray();
		Arrays.sort(chars);

		/*
		 * Create a new string from the current permutation and add it to the result
		 * list. Generate a new permutation and check whether it's different from the
		 * last permutation. Repeat as long as it is.
		 * 
		 * Note that nextPermutation() changes the char array *in place*. This works
		 * only because we generate a new string from each result. If we made a list of
		 * the char arrays themselves we'd end up with a list containing the final
		 * permutation multiple times.
		 */
		boolean newOneFound;
		do {
			permutationsAsList.add(new String(chars));
			newOneFound = nextPermutation(chars);
		} while (newOneFound);

		/*
		 * Convert the list of results to an array and return it.
		 */
		String[] result = permutationsAsList.toArray(new String[permutationsAsList.size()]);
		return result;

	}

	/**
	 * Takes a string and generates its next permutation in lexicographical order.
	 * 
	 * @param input
	 * @return the next permutation of the string
	 */
	public static String getNextPermutation(String input) {
		char[] chars = input.toCharArray();
		nextPermutation(chars);
		String result = new String(chars);
		return result;
	}

	/*
	 * Takes an array and changes it to its next permutation in lexicographical
	 * order. Returns true if the new permutation is different from the old one.
	 * 
	 * A good explanation of lexicographical permutation is at
	 * https://www.nayuki.io/page/next-lexicographical-permutation-algorithm
	 * 
	 * The program searches for the rightmost substring that is not at its last
	 * permutation yet. A sequence is at its last permutation when it is in reverse
	 * lexicographical order, meaning that each character is greater or equal than
	 * its successor. So the program searches for the last character that is smaller
	 * than its immediate successor. This character and the rest of the string form
	 * the smallest permutable substring, e.g.
	 * 
	 * 1113664422 -> 111(3)(664422)
	 * 
	 * (By 'permutable' I refer to a sequence that has a higher lexicographical
	 * permutation, not any sequence that is permutable at all.)
	 * 
	 * To get the smallest higher permutation, the first character is swapped with
	 * the smallest character that is greater. If there are multiple instances of
	 * the smallest larger character, then the rightmost one is used. e.g.
	 * 
	 * 111(3)664422 -> 111(4)664(3)22
	 * 
	 * Then the rest of the string needs to be put at its lowest permutation, which
	 * is lexicographical order. Since it's already in reverse lexicographical
	 * order, it just needs to be reversed:
	 * 
	 * 1114(664322) -> 1114(223466)
	 * 
	 * Here are some sample sequences of permutations. The respective last
	 * 'permutable' character is marked by brackets:
	 * 
	 * [12(3)4, 1(2)43, 13(2)4, 1(3)42, 14(2)3, (1)432, 21(3)4, 2(1)43, 23(1)4,
	 * 2(3)41, 24(1)3, (2)431, 31(2)4, 3(1)42, 32(1)4, 3(2)41, 34(1)2, (3)421,
	 * 41(2)3, 4(1)32, 42(1)3, 4(2)31, 43(1)2, 4321]
	 * 
	 * [13(3)7, 1(3)73, (1)733, 31(3)7, 3(1)73, 33(1)7, 3(3)71, 37(1)3, (3)731,
	 * 7(1)33, 73(1)3, 7331]
	 * 
	 * [a(a)bb, ab(a)b, (a)bba, ba(a)b, b(a)ba, bbaa]
	 * 
	 * Note that this implementation works slightly differently. Instead of first
	 * swapping characters and then reversing the substring, it first reverses the
	 * substring and then swaps the characters:
	 * 
	 * not 111(3)(642) -> 111(4)6(3)2 -> 1114(236)
	 * 
	 * but 111(3)642 -> 111(3)(246) -> 111(4)2(3)6
	 * 
	 */
	private static boolean nextPermutation(char[] chars) {

		/*
		 * set up a variable to track whether a permutable sequence is found, and
		 * another one to track the position in the array
		 */
		boolean permutableFound = false;
		int pos;

		/*
		 * Traverse the array from end to start until you find a character that's
		 * smaller than its successor. If one is found, set 'found' to true and break
		 * out of the loop. Now pos holds the position of the second character.
		 * 
		 * If chars[0] is reached without a find, the entire array is already on its
		 * last permutation. Then the method returns false.
		 */
		for (pos = chars.length - 1; pos > 0; pos--) {
			if (chars[pos - 1] < chars[pos]) {
				permutableFound = true;
				break;
			}
		}

		/*
		 * If found is now true, the fun begins...
		 */
		if (permutableFound) {

			/*
			 * set up a few variables for swapping characters around
			 */
			char placeholder;
			int left;
			int right;

			/*
			 * reverse everything from input[pos] to the end. following
			 * https://stackoverflow.com/questions/2137755/how-do-i-reverse-an-int-array-in-
			 * java
			 */
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
			 * Search from input[pos] to the end until you find an element bigger than
			 * input[pos-1]. Swap this element with input[pos].
			 */
			left = pos - 1;
			right = pos;
			while (chars[left] >= chars[right]) {
				right++;
			}
			placeholder = chars[left];
			chars[left] = chars[right];
			chars[right] = placeholder;

		} // end of big if block

		return permutableFound;

	} // end of getNextPermutation(String input)

}
