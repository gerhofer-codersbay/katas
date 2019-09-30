package at.codersbay.katas;

import java.util.stream.*;

public class CountofNumbers {

    public void ArrayofNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -2, -3, -4, -5, -6};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " ");

            } else if (numbers[i] < 0) {
                sum = sum + numbers[i];


            }

        }
        System.out.print(sum);

    }

}

