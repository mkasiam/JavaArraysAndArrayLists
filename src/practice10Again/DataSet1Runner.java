package practice10Again;

import practiceExercise10.DataSet;

public class DataSet1Runner {
    public static void main(String[] args) {
        DataSet test1 = new DataSet(5);
        test1.add(1000);
        test1.add(400);
        test1.add(8000);
        test1.add(35.00);
        test1.add(100.20);
        test1.getSum();
        System.out.printf("Sum of the Numbers: %.2f\n", test1.getSum());
        System.out.printf("Average Value: %.2f\n", test1.average());
        System.out.println("Maximum Number of the Numbers: " + test1.maximumValue());
        System.out.println("minimum Number of the Numbers: " + test1.minimumValue());
    }
}
