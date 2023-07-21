import java.util.Scanner;

public class TrendyDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char ch = str.charAt(1);

        int a = Integer.parseInt(String.valueOf(ch));

        if (a % 3 == 0) {
            System.out.println("Trendy Number");
        } else {
            System.out.println("Not a Trendy Number");
        }

        sc.close();
    }

}
