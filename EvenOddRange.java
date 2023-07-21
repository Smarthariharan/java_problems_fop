import java.util.Scanner;

public class EvenOddRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();

        int end = sc.nextInt();

        printOddNumbers(start, end);

        printEvenNumbers(start, end);

        sc.close();
    }

    public static void printOddNumbers(int start, int end) {
        if (start > end) {
            return;
        }

        if (start % 2 != 0) {
            System.out.print(start + " ");
        }

        printOddNumbers(start + 1, end);
    }

    public static void printEvenNumbers(int start, int end) {
        if (start > end) {
            return;
        }

        if (start % 2 == 0) {
            System.out.print(start + " ");
        }

        printEvenNumbers(start + 1, end);
    }

}
