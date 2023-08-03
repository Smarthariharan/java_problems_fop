import java.util.Scanner;

public class DigitsSumEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Calculate c = new Calculate(n);
        System.out.println(c.getDigit());
    }
}

class Calculate {
    private int n;

    public Calculate(int n) {
        this.n = n;
    }

    public int getDigit() {
        int num = 0;
        while (n != 0) {
            int r = n % 10;
            num += r;
            n /= 10;
        }
        return num;
    }

}