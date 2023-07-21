import java.util.Scanner;

public class AliceWonderland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String numberString = String.valueOf(number);

        int sumOfDigits = 0;
        for (int i = 0; i < numberString.length(); i++) {
            int digit = Character.getNumericValue(numberString.charAt(i));
            sumOfDigits += digit;
        }

        System.out.println("Alice must go in path-" + sumOfDigits);
        // int digit1 = number / 10;
        // int digit2 = number % 10;
        // int sumOfDigits = digit1 + digit2;

        sc.close();
    }
}
