import java.util.Scanner;

public class RemovePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] string = str.split(" ");
        sc.close();
        String s = "";
        for (int i = 0; i < string.length; i++) {
            String result = palindrome(string[i]);
            // s += String.join(" ", result);
            s += result + " ";

        }
        System.out.println(s);

    }

    public static String palindrome(String word) {
        int n = word.length();
        int start = 0;
        int end = n - 1;
        if (n == 1) {
            return word;
        }
        while (start < end) {

            if (word.charAt(start) != word.charAt(end)) {
                return word;
            }
            start++;
            end--;

        }
        return "";
    }
}
