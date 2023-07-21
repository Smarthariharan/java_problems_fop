import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numRows = sc.nextInt();

        int numRows1 = numRows + 1;
        printPascalTriangle(numRows1);

        sc.close();
    }

    public static void printPascalTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            int num = 1;
            System.out.print(num + " ");

            for (int j = 1; j <= i; j++) {
                num = num * (i - j + 1) / j;
                System.out.print(num + " ");
            }
        }
    }
}
