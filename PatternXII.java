import java.util.Scanner;

public class PatternXII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        for (int i = 0; i < x.length(); i++) {
            for (int j = 0; j < x.length(); j++) {
                if (i == j || i + j == x.length() - 1) {
                    System.out.print(x.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
