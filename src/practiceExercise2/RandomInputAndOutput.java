package practiceExercise2;

import java.util.Random;

public class RandomInputAndOutput {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] numbers = new int[LENGTH];
        Random random = new Random();


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }


        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
        numbersInRevers(numbers);
        System.out.println();

        System.out.print(numbers[0] + " " + numbers[numbers.length - 1]);
        System.out.println();
    }

    public static void numbersInRevers(int[] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
