import java.util.Scanner;

public class SentenceSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shuffledSentence = sc.nextLine();
        sc.close();

        String[] words = shuffledSentence.split(" ");
        String[] originalWords = new String[words.length];

        for (String word : words) {
            int position = Integer.parseInt(word.replaceAll("[^0-9]", ""));
            originalWords[position - 1] = word.replaceAll("[0-9]", "");
        }

        String originalSentence = String.join(" ", originalWords);
        System.out.println(originalSentence);
    }
}
