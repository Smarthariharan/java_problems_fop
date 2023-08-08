import java.util.Scanner;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        char result = findFirstNonRepeatingChar(str);

        if (result != '\0') {
            System.out.println(result);
        } else {
            System.out.println("All characters are repeating.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256];

        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        for (char c : str.toCharArray()) {
            if (charCount[c] == 1) {
                return c;
            }
        }

        return '\0';
    }
}
