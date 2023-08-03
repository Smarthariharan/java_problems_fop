import java.util.Scanner;

abstract class addition {
    abstract int add(int a, int b);
}

class addition1 extends addition {
    public int add(int a, int b) {
        return a + b;
    }
}

public class AdditionAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        addition1 ad = new addition1();
        int i = ad.add(a, b);
        System.out.println("sum: " + i);

    }
}
