import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CollectionCharFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        Map<Character, Integer> frequencyMap = new TreeMap<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

        }

        System.out.println("Character frequency in given text:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
    }
}
