import java.util.Scanner;

public class OddOrEvenEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        Find f = new Find(n);
        System.out.println(f.isFind());
    }

}

class Find {
    private int n;

    public Find(int n) {
        this.n = n;
    }

    public String isFind() {
        if (n % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }

}