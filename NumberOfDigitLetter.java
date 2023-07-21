import java.util.Scanner;

public class NumberOfDigitLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int LetterCount = 0;
        int NumberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                NumberCount++;
            } else if (Character.isLetter(ch)) {
                LetterCount++;
            }
        }
        System.out.println("The number of digits is:");
        System.out.println(NumberCount);
        System.out.println("The number of characters is:");
        System.out.println(LetterCount);
    }
}
