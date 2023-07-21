import java.util.Scanner;

public class PrintEvenIndex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder string = new StringBuilder();
        sc.close();

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 1) {
                continue;
            } else {
                string.append(str.charAt(i));
            }
        }
        System.out.println(string.toString());
    }
}
