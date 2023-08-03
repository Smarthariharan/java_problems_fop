import java.util.Scanner;

abstract class Number {

    abstract int isPerfect(int num);
}

class perfectNumber extends Number {

    public int isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}

public class PerfectNumberAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        perfectNumber number = new perfectNumber();

        if (number.isPerfect(num) == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
