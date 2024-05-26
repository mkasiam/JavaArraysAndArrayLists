package practiceExercise6;

import java.util.Scanner;

public class AlternatingSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int LENGTH = 9;
        int[] numbers = new int[LENGTH];
        int evenPositionSum = 0;
        int oddPositionSum = 0;
        for (int i = 0; i < 9; i++) {
            numbers[i] = in.nextInt();
            if (i % 2 == 0) {
                evenPositionSum = evenPositionSum + numbers[i];
            }else {
                oddPositionSum = oddPositionSum + numbers[i];
            }
        }
        System.out.println("Alternating Sum is: " + (evenPositionSum - oddPositionSum));
    }
}
