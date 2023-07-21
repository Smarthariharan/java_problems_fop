import java.util.Scanner;

public class RemoveString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.equals("the")) {
                result.append(word).append(" ");
            }
        }

        String output = result.toString().trim();
        System.out.println(output);
        sc.close();
    }
}
