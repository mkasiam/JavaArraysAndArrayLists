package practice10Again;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = in.nextInt();
        }

        int largest = numbers[0];

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println("Numbers with largest value print along with it's side.");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
            if (numbers[i] == largest) {
                System.out.print("<= Largest Value");
            }
            System.out.println();
        }

    }
}
