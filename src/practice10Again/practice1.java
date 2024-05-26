package practice10Again;

import java.util.Arrays;

public class practice1 {
    public static void main(String[] args) {
        int[] scores = {60, 20, 250, 60};
        int[] values = Arrays.copyOf(scores, scores.length);

        values[3] = 100;
//
//        Arrays.sort(values);
//


        int smallestPosition = 0;
        int smallest = values[0];
        for (int i = 0; i < scores.length; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
                smallestPosition = i;
            }
        }
        for (int i = smallestPosition + 1; i < scores.length ; i++) {
            values[i - 1] = values[i];
        }

        for (int element : values) {
            System.out.println(element);
        }


    }

}
