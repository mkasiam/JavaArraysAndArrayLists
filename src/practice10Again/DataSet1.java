package practice10Again;

public class DataSet1 {
    private double[] values;
    private int currentSize = 0;

    public DataSet1(int maximumNumberOfValue) {
        values = new double[maximumNumberOfValue];
    }

    public void add(double value) {
        if (values.length > currentSize) {
            values[currentSize] = value;
            currentSize++;
        }else {
            System.out.println("There is no room to fit another Number.");
        }
    }

    public double getSum() {
        double sum = 0;
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        } else {
            for (int i = 0; i < currentSize; i++) {
                sum = sum + values[i];
            }
        }
        return sum;
    }
    public double getAverageValue() {
        double average = 0;
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        }else {
            return (getSum() / currentSize);
        }
    }

    public double getMaximumValue() {
        double maximum = values[0];
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        }else {
            for (int i = 0; i < currentSize; i++) {
                if (values[i] > maximum) {
                    maximum = values[i];
                }
            }
        }
        return maximum;
    }

    public double getMinimumValue() {
        double minimum = values[0];
        if (currentSize == 0) {
            return Double.NEGATIVE_INFINITY;
        }else {
            for (int i = 0; i < currentSize; i++) {
                if (values[i] < minimum) {
                    minimum = values[i];
                }
            }
        }
        return minimum;
    }
}
