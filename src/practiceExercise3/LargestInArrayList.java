package practiceExercise3;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestInArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Double> values = new ArrayList<Double>();

        System.out.println("Please enter values, Q to quit:");
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble())
        {
            values.add(in.nextDouble());
        }

        double largest = values.get(0);
        double smallest = values.get(0);

        for (int i = 1; i < values.size(); i++)
        {
            if (values.get(i) > largest)
            {
                largest = values.get(i);
            }
            if (values.get(i) < smallest)
            {
                smallest = values.get(i);
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Smallest Number:" + smallest);
    }


}
