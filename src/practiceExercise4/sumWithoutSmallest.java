package practiceExercise4;

import java.util.Random;

public class sumWithoutSmallest {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] numbers = new int[LENGTH];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        int sum = 0;
        int smallest = numbers[0];


        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }

            sum += numbers[i];

        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Sum exiting the smallest one:" + (sum - smallest));
    }
}
