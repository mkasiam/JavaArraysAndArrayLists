package practice10Again;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayListsNew {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<String> names = new ArrayList<>();
        names.add("Siam");
        names.add("Siddik");
        names.add("Jeyam");
        names.add("Shafi");
        names.add("Shahadat");
        names.set(4,"Kawsar");
        names.set(2,"Rafi");
        names.remove(2);
        names.remove(1);
        System.out.println(names.get(names.size() - 1));

//        System.out.println(names.get(2));

        System.out.println(names);
        for (String element : names) {
            System.out.println(element);
        }
        ArrayList<Double> numbers = new ArrayList<Double>();
//        numbers.add(30);
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextDouble(100));
        }
        for (double number: numbers) {
            System.out.println(number);
        }

        int[] nums = {1, 2, 3, 5};
        int[] numbers2 = Arrays.copyOf(nums, 4);
        numbers2[0] = 100;
        for (int element : numbers2) {
            System.out.println(element);
        }
    }
}
