import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        int square = num * num;
        String squareString = String.valueOf(square);
        int n = String.valueOf(num).length();

        int left = Integer.parseInt(squareString.substring(0, squareString.length() - n));
        int right = Integer.parseInt(squareString.substring(squareString.length() - n));

        if (left + right == num) {
            System.out.println("Kaprekar Number");
        } else {
            System.out.println("Not A Kaprekar Number");
        }
    }
}
