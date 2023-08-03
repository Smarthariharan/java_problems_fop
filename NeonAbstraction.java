import java.util.Scanner;

abstract class NeonChecker {
    abstract boolean isNeon(int num);
}

class NeonCheckerImpl extends NeonChecker {
    @Override
    boolean isNeon(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == num;
    }
}

public class NeonAbstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        NeonChecker neonChecker = new NeonCheckerImpl();

        if (neonChecker.isNeon(num)) {
            System.out.println("Neon");
        } else {
            System.out.println("Not Neon");
        }
    }
}
