import java.util.Scanner;

public class FormWordTwoWordsEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        StringBuilder string = new StringBuilder();
        sc.close();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1 || i == n - 2 || i == n - 1) {
                string.append(str.charAt(i));
            }
        }
        System.out.println(string.toString());

    }
}
