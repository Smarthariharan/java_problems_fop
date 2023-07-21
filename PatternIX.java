import java.util.Scanner;

public class PatternIX {
    public static void trapeziumPattern(int num) {

        int firsthalf = 1;
        int secondhalf = (num * num) + 1;
        int numOfSpaces = 0;

        for (int numOfLines = num; numOfLines >= 1; numOfLines--) {

            for (int numOfSpacesCounter = numOfSpaces; numOfSpacesCounter >= 1; numOfSpacesCounter--) {
                System.out.print(" ");
            }

            for (int firstHalfCounter = 1; firstHalfCounter <= numOfLines; firstHalfCounter++) {

                if (firstHalfCounter == numOfLines)
                    System.out.print((firsthalf++));

                else
                    System.out.print((firsthalf++) + "*");
            }

            for (int secondHalfCounter = 1; secondHalfCounter <= numOfLines; secondHalfCounter++) {
                System.out.print("*" + (secondhalf++));
            }

            System.out.println();

            numOfSpaces += 2;

            secondhalf = (secondhalf - 1) - ((numOfLines - 1) * 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        trapeziumPattern(n);

    }
}
