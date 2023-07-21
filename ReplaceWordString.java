import java.util.Scanner;

public class ReplaceWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        sc.close();

        String word = str.replace(' ', ch);

        System.out.println(word);

    }
}
