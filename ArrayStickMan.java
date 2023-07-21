import java.util.Scanner;

public class ArrayStickMan {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        if (n < 0) {
            System.out.println("Arun Gupta");
        } else if (n % 2 == 0) {
            System.out.println("Mani Iyer");
        } else {
            System.out.println("Arun Gupta");
        }

    }
}
