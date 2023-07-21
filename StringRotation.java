import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();
        boolean isRotation = checkRotation(str1, str2);
        if (isRotation) {
            System.out.println("Second string is a rotation of first string");
        } else {
            System.out.println("Second string is not a rotation of first string");
        }

    }

    private static boolean checkRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenateString = str1 + str1;
        return concatenateString.contains(str2);

    }
}
