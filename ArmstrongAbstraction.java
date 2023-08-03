import java.util.Scanner;

abstract class ArmstrongChecker {
    abstract boolean isArmstrong(int num);
}

class ArmstrongCheckerImpl extends ArmstrongChecker {
    @Override
    boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = (int) Math.log10(num) + 1;
        int sumOfPowers = 0;

        while (num > 0) {
            int digit = num % 10;
            sumOfPowers += Math.pow(digit, numDigits);
            num /= 10;
        }

        return originalNum == sumOfPowers;
    }
}

public class ArmstrongAbstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        ArmstrongChecker armstrongChecker = new ArmstrongCheckerImpl();

        if (armstrongChecker.isArmstrong(num)) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }
    }
}
