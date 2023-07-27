import java.util.*;

public class Anthackshiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("###")) {
                break;
            }

            strings.add(input);
        }
        sc.close();
        int n = strings.size();
        String w = strings.get(0);
        String wo = strings.get(1);
        int x = w.length();

        if (wo.charAt(0) == w.charAt(x - 1)) {
            System.out.println(w);
            for (int i = 0; i < n - 1; i++) {

                String word = isEqual(strings.get(i), strings.get(i + 1));
                System.out.println(word);

            }

        }

    }

    public static String isEqual(String word1, String word2) {
        int n = word1.length();
        if (word1.charAt(n - 1) == word2.charAt(0)) {
            return word2;
        }

        return "";
    }
}
