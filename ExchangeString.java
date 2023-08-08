import java.util.Scanner;

public class ExchangeString {
    public static void main(String[] args) {
        // Try out your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        sc.close();
        str1 = str1.trim();
        int x = str.indexOf(str1.charAt(0));
        String result;
        if (x == -1) {
            int y = str.indexOf(" ");
            result = str.substring(0, y) + " " + str1;
        } else {
            result = str.substring(0, x) + str1;
        }

        System.out.println(result);

    }
}
