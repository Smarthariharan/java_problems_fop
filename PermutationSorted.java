import java.util.Arrays;
import java.util.Scanner;

public class PermutationSorted {
    public static void generateSortedPermutations(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix);
            return;
        }
        char[] chars = remaining.toCharArray();
        Arrays.sort(chars);
        String sortedRemaining = new String(chars);
        for (int i = 0; i < n; i++) {
            String newPrefix = prefix + sortedRemaining.charAt(i);
            String newRemaining = sortedRemaining.substring(0, i) + sortedRemaining.substring(i + 1);
            generateSortedPermutations(newPrefix, newRemaining);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        generateSortedPermutations("", input);
        scanner.close();
    }
}
