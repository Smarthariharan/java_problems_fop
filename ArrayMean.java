import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        double mean = calculateMean(array);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String meanFormatted = decimalFormat.format(mean);

        System.out.println("Mean: " + meanFormatted);

        scanner.close();
    }

    public static double calculateMean(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }

        double mean = (double) sum / array.length;
        return mean;
    }
}
