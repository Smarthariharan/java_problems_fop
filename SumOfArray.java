import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        // fill the code
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[num];

        for (int i = 0; i < num; i++) {
            arr1[i] = scan.nextInt();
        }
        for (int j = 0; j < num; j++) {
            arr2[j] = scan.nextInt();
        }

        int[] sumArray = new int[num];
        for (int i = 0; i < num; i++) {
            sumArray[i] = arr1[i] + arr2[i];
            System.out.println(sumArray[i]);
        }
        scan.close();
    }
}
