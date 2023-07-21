import java.util.Scanner;

public class MinMaxWordString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();
        scanner.close();

        String[] words = sentence.split(" ");

        String smallestWord = words[0];
        String largestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            String word = words[i];

            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }

            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
}
