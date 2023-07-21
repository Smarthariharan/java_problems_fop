import java.util.Scanner;

public class StringReverseRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        String reversed = reverseString(word);
        System.out.println(reversed);

        sc.close();
    }

    public static String reverseString(String str) {
        if (str.length() == 0) {
            return str;
        }

        char lastChar = str.charAt(str.length() - 1);
        String remaining = str.substring(0, str.length() - 1);

        return lastChar + reverseString(remaining);
    }
}
