import java.util.Scanner;

class Factorial {
    int sum = 1;

    public void calculate(int n) {
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
    }
}

class SumOfN {
    int sum = 0;

    public void calculate(int n) {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
    }
}

public class PolymorphismFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Factorial factorial = new Factorial();
        SumOfN sumOfN = new SumOfN();

        int n = scanner.nextInt();
        scanner.close();

        factorial.calculate(n);
        sumOfN.calculate(n);

        System.out.println(factorial.sum);
        System.out.println(sumOfN.sum);
    }
}