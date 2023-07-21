import java.util.Scanner;

public class FindingAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);
        // if (Character.isLetter(a)) {
        // a = Character.toLowerCase(a);
        // if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
        // System.out.println("Vowel");
        // } else {
        // System.out.println("Consonant");
        // }
        // } else {
        // System.out.println("Not an alphabet");
        // }

        sc.close();

        switch (a) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;

            case 'b', 'c', 'd':
                System.out.println("Consonant");
                break;

            default:
                System.out.println("Not an alphabet");
        }
    }
}
