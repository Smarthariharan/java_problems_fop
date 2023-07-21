import java.util.Scanner;

public class LetterFrequencyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        for (char c = 'a'; c <= 'z'; c++) {
            int count = countOccurrences(input, c);
            if (count > 0) {
                System.out.println(c + "" + count);
            }
        }
    }

    public static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}
