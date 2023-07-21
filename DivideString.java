import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        sc.close();

        int m = str.length();

        if (m % n == 0) {
            int k = m / n;
            int start = 0;

            for (int i = 0; i < n; i++) {
                int end = start + k;
                for (int j = start; j < end; j++) {
                    System.out.print(str.charAt(j));
                }
                System.out.println();
                start = end;
            }
        } else {
            System.out.println("Sorry, this string cannot be divided into " + n + " equal parts.");
        }

    }
}
