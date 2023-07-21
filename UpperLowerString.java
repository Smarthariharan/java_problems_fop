import java.util.Scanner;

public class UpperLowerString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        sc.close();

        StringBuilder string = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                string.append(Character.toUpperCase(ch));
            } else if (Character.isUpperCase(ch)) {
                string.append(Character.toLowerCase(ch));
            } else {
                string.append(ch);
            }
        }
        System.out.println("String after case conversion: " + string);
    }
}
