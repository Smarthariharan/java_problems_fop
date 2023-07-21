import java.util.Scanner;

public class HappyNumber {

    public static boolean isHappyNumber(int number) {
        int slow = number;
        int fast = number;

        do {
            slow = findSumOfSquaredDigits(slow);
            fast = findSumOfSquaredDigits(findSumOfSquaredDigits(fast));

            if (fast == 1) {
                return true; // It is a happy number
            }
        } while (slow != fast);

        return false; // It is not a happy number
    }

    private static int findSumOfSquaredDigits(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();

        if (isHappyNumber(number)) {
            System.out.println("Happy Number");
        } else {
            System.out.println("Unhappy Number");
        }
    }
}
