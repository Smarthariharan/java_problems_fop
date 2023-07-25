import java.util.Scanner;

public class TwoTimingsCandO {
    public TwoTimingsCandO(int a, int b, int c, int d, int e, int f) {
        int seconds = c + f;
        int min = 0;
        int hour = 0;
        String output = "";
        if (seconds >= 60) {
            min = seconds / 60;
            seconds = seconds % 60;
            output += seconds;
        } else {
            output += seconds;
        }

        int minutes = b + e + min;
        if (minutes >= 60) {
            hour = minutes / 60;
            minutes = minutes % 60;
            output += minutes;
        } else {
            output += minutes;
        }

        int hours = a + d + hour;
        output += hours;

        System.out.print(hours + ":");
        System.out.print(minutes + ":");
        System.out.print(seconds);

    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = scanner.nextInt();

        int e = scanner.nextInt();

        int f = scanner.nextInt();
        scanner.close();

        TwoTimingsCandO main = new TwoTimingsCandO(a, b, c, d, e, f);

    }
}
