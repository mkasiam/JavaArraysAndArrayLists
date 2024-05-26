package practiceExercise7;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int LENGTH = 9;
        int[] numbers = new int[LENGTH];

        for (int i = 0; i < LENGTH; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = LENGTH - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
