import java.util.Scanner;

public class CheckingFirstLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String string = sc.next();
        StringBuilder st = new StringBuilder();
        sc.close();

        int n = str.length() - 1;
        int m = string.length() - 1;

        if (n != m) {
            System.out.println("It is not same");
            return;

        } else {
            for (int j = m; j >= 0; j--) {
                st.append(string.charAt(j));

            }
            if (str.equals(st.toString())) {
                System.out.println("It is same");
            } else {
                System.out.println("It is not same");
            }
        }

    }
}
