import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String string = str.toLowerCase().trim();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        boolean match = true;
        for (char c : alphabet.toCharArray()) {
            if (!string.contains(String.valueOf(c))) {
                match = false;
                break;
            }
        }

        if (match) {
            System.out.println("The string is a pangram");

        } else {

            System.out.println("The string is a not pangram");
        }
        sc.close();
    }
}
