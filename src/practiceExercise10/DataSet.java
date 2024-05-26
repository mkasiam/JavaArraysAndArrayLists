package practiceExercise10;


public class DataSet {
    private double[] values;
    int currentSize = 0;

    public DataSet(int maximumNumberOfValues) {
       values = new double[maximumNumberOfValues];
    }

    public void add(double value) {
        if (values.length > currentSize) {
            values[currentSize] = value;
            currentSize++;
        }else {
            System.out.println("There is no room to store this.");
        }
    }

    public double getSum() {
        double sum = 0;
        for (int i = 0; i < currentSize; i++) {
            sum = sum + values[i];
        }
        return sum;
    }
    public double average() {
        if (currentSize == 0){
            return Double.NEGATIVE_INFINITY;
        }else {
            return getSum() / currentSize;
        }
    }
    public double maximumValue() {
        double maximum = values[0];
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        }else{
            for (int i = 0; i < values.length; i++) {
                if (values[i] > maximum) {
                    maximum = values[i];
                }
            }
        }
        return maximum;
    }
    public double minimumValue() {
        double minimum = values[0];
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        }else{
            for (int i = 0; i < values.length; i++) {
                if (values[i] < minimum) {
                    minimum = values[i];
                }
            }
        }
        return minimum;
    }
}
