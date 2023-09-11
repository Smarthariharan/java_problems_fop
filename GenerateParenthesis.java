
import java.util.Scanner;

public class GenerateParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        parentheses("", N, N);
    }

    public static void parentheses(String current, int open, int close) {
        if (open == 0 && close == 0) {
            System.out.println(current);
            return;
        }

        if (close > open) {
            parentheses(current + ")", open, close - 1);
        }

        if (open > 0) {
            parentheses(current + "(", open - 1, close);
        }
    }
}