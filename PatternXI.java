import java.util.Scanner;

public class PatternXI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        StringBuilder o = new StringBuilder();
        StringBuilder p = new StringBuilder();
        for (int i = 0; i < x.length() / 2; i++) {
            o.append(x.charAt(i));
        }
        for (int i = x.length() / 2; i < x.length(); i++) {
            p.append(x.charAt(i));
        }
        x = p.toString() + o;
        for (int i = x.length() - 1; i >= 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < x.length() - i; k++) {
                System.out.print(x.charAt(k));
            }
            System.out.println();

        }
        sc.close();
    }
}
