import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMedian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        double median = calculateMedian(array);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String medianFormatted = decimalFormat.format(median);

        System.out.println("Median: " + medianFormatted);

        scanner.close();
    }

    public static double calculateMedian(int[] array) {
        Arrays.sort(array);

        int middleIndex = array.length / 2;

        if (array.length % 2 == 0) {
            double median = (array[middleIndex - 1] + array[middleIndex]) / 2.0;
            return median;
        } else {
            return array[middleIndex];
        }
    }
}
