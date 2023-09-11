import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two binary strings a and b
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Call the addBinary function to calculate the sum
        String sum = addBinary(a, b);

        // Output the sum
        System.out.println(sum);
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        return result.toString();
    }
}
