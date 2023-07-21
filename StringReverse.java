import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = "";
        int length = str.length() - 1;
        for (int i = length; i >= 0; i--) {
            word += str.charAt(i);
        }
        System.out.println(word);
        sc.close();
    }
}
