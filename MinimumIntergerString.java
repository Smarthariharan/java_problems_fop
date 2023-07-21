import java.util.Scanner;

public class MinimumIntergerString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();

        int minimumNumber = findMinimumNumber(str);
        System.out.println(minimumNumber);
    }

    private static int findMinimumNumber(String str) {
        int minimum = Integer.MAX_VALUE;
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                number.append(ch);
            } else {
                if (number.length() > 0) {
                    int currentNumber = Integer.parseInt(number.toString());
                    minimum = Math.min(minimum, currentNumber);
                    number.setLength(0);
                }
            }
        }

        if (number.length() > 0) {
            int currentNumber = Integer.parseInt(number.toString());
            minimum = Math.min(minimum, currentNumber);
        }

        return minimum;

    }
}
