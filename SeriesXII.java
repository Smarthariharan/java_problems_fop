import java.util.Scanner;

public class SeriesXII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int[] series = new int[n];
        series[0] = 9;
        series[1] = 11;

        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(series[i] + " ");
        }

    }
}
