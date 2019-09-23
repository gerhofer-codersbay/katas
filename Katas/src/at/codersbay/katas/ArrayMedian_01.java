package at.codersbay.katas;

import java.util.ArrayList;

public class ArrayMedian_01 {

	/* ArrayList_Median */

	/**
	 * The median value is the middle one in a set of values arranged 
	 * in order of size. In case, the number of elements is equal, the two middle
	 * elements are added and divided by 2 to get the median element of the set of numbers.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {

		arrayMedian_01();

	}

	public static void arrayMedian_01() {
		ArrayList<Integer> medianSet = new ArrayList<>();
		medianSet.add(1);
		medianSet.add(12);
		medianSet.add(14);
		medianSet.add(21);
		medianSet.add(13);
		medianSet.add(41);
		medianSet.add(51);
		medianSet.add(11);
		medianSet.add(15);
		medianSet.add(5);
		//medianSet.add(33);

		System.out.println(medianSet);
		medianSet.sort(Integer::compareTo);
		System.out.println(medianSet);
		System.out.println(medianSet.size());
		System.out.println(medianSet.size() / 2);
		float median = Math.round(medianSet.size() / 2);
		System.out.println(median);

		if (median < medianSet.size() / 2) {
			median++;
			System.out.println(median);
		}

		System.out.println((medianSet.size() / 2) + 1);
		System.out.println(medianSet.get(medianSet.size() / 2));
	}

}
