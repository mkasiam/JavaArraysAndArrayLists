package practice10Again;

public class Medals {
    public static void main(String[] args) {
        final int COUNTRIES = 8;
        final int MEDALS = 3;
        String[] countries = {"India","Pakistan","England",
        "USA","Japan","South Korea","China","Bangladesh"};
        int[][] medals = {
                {0, 3, 0},
                {1, 1 , 5},
                {0, 3, 0},
                {1, 1 , 5},
                {0, 3, 0},
                {1, 1 , 5},
                {0, 3, 0},
                {1, 1 , 5},
        };
        System.out.println("        Country         Gold        Silver      Bronze      Total");
        for (int i = 0; i < COUNTRIES; i++) {
            System.out.printf("%15s", countries[i]);
            int total = 0;
            for (int j = 0; j < MEDALS; j++){
                System.out.printf("%15d",medals[i][j]);
                total = total + medals[i][j];
            }
            System.out.printf("%8d%n", total);
        }
    }
}
