import java.util.Scanner;

public class ReplacingA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A') {
                string.append('$');
            } else {
                string.append(str.charAt(i));
            }
        }
        System.out.println(string);
    }
}
