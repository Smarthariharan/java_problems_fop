import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String oldWord = input.nextLine();
        String newWord = input.nextLine();
        input.close();

        String replacedSentence = replaceSubstring(sentence, oldWord, newWord);
        System.out.println(replacedSentence);
    }

    private static String replaceSubstring(String sentence, String oldWord, String newWord) {
        String regex = "\\b" + oldWord + "\\b";
        return sentence.replaceAll(regex, newWord);
    }
}
