package practice10Again;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        final int LENGTH = 8;
        int[] numbers = new int[LENGTH];
        int halfLength = LENGTH / 2;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < LENGTH; i++) {
            numbers[i] = in.nextInt();
        }
        int j = halfLength;

        for (int i = 0; i < halfLength; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            j++;
        }
        for (int element : numbers) {
            System.out.print(element + " ");
        }
    }
}
