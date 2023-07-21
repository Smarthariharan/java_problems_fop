import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // sc.close();

        // if (isPalindrome(str)) {
        // System.out.println("palindrome");
        // } else {
        // System.out.println("Not a palindrome");
        // }
        // }

        // private static boolean isPalindrome(String str) {
        // int left = 0;
        // int right = str.length() - 1;

        // while (left < right) {
        // if (str.charAt(left) != str.charAt(right)) {
        // return false;
        // }
        // left++;
        // right--;
        // }
        // return true;

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = str.toLowerCase().trim();
        int n = str1.length();
        boolean check = true;
        sc.close();

        for (int i = 0; i < n / 2; i++) {
            if (str1.charAt(i) != str1.charAt(n - 1 - i)) {
                check = false;
            }
        }

        if (check == false) {
            System.out.println("Not a palindrome");

        } else {
            System.out.println("Palindrome");

        }

    }
}
