import java.util.Scanner;

public class SquareNumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            int number = i * i;
            System.out.print(number + " ");
        }

        sc.close();

    }
}
