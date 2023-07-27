import java.util.Scanner;

public class DataMining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while (n > 0) {
            int remainder = n % 10;
            if (remainder % 2 == 0) {
                even += remainder;
            } else {
                odd += remainder;
            }
            n = n / 10;
        }
        if (even == odd) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
