import java.util.Scanner;

public class CountUpperLower {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        int Lcase = 0;
        int Ucase = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                Lcase++;
            } else if (Character.isUpperCase(ch)) {
                Ucase++;
            }
        }
        System.out.println(Lcase);
        System.out.println(Ucase);
    }
}
