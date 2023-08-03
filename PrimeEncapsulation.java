import java.util.Scanner;

public class PrimeEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Prime p = new Prime(n);
        System.out.println(p.isPrime());
    }
}

class Prime {
    private int n;

    public Prime(int n) {
        this.n = n;
    }

    public String isPrime() {
        boolean p = true;
        if (n == 1 || n == 0) {
            return "Not Prime";
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                p = false;
                break;
            } else {
                p = true;
            }

        }
        if (p) {
            return "Prime";
        } else {
            return "Not Prime";
        }

    }
}
