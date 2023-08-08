import java.util.Scanner;

public class BinaryStirng {
    public static void main(String[] args) {
        // Try out your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        int n = Integer.parseInt(str);

        while (n != 0) {
            if (n % 10 > 1) {
                System.out.println("Not a Binary String");
                return;
            }
            n = n / 10;
        }

        System.out.println("Binary String");
    }
}
