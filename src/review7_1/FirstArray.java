package review7_1;

public class FirstArray {
    public static void main(String[] args) {
        final int LENGTH = 10;
        int[] arr = new int[LENGTH];
        arr[0] = 17;
        arr[9] = 29;

        for (int i = 1; i < 9; i++) {
            arr[i] = -1;
        }
        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] + 1;
        }
        for (int number : arr){
            System.out.println(number);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else{
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
