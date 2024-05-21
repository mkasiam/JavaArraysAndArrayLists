package practiceExercise1;

import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] numbers = new int[LENGTH];

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 10 Numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        System.out.println("Number in Reverse:");
        for (int i = numbers.length - 1; i >= 0; i-- ) {
            System.out.print(numbers[i] + " ");
        }
    }
}
