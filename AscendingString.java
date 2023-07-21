import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < alphabets.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (alphabets.charAt(i) == str.charAt(j)) {
                    string.append(str.charAt(j));
                }
            }
        }
        System.out.println(string.toString());
    }
}
