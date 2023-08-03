import java.util.Scanner;

public class OddSumEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Range r = new Range(n);
        System.out.println(r.odd());
    }
}

class Range {
    private int n;

    public Range(int n) {
        this.n = n;
    }

    public int odd() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
