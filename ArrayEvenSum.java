import java.util.Scanner;

public class ArrayEvenSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        int sum_even_num = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                sum_even_num += arr[i];
            }
        }

        System.out.print("The sum of the even numbers in the array is " + sum_even_num);
    }
}
