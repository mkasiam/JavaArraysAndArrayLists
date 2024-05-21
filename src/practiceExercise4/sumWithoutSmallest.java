package practiceExercise4;

import java.util.Random;

public class sumWithoutSmallest {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] numbers = new int[LENGTH];
        Random random = new Random(100);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }

        int sum = 0;
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        boolean smallestExcluded = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallest && !smallestExcluded) {
                smallestExcluded = true;
            } else {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
