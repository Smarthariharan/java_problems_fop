import java.util.Scanner;

public class midPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1 = sc.nextInt();
        float y1 = sc.nextInt();
        float x2 = sc.nextInt();
        float y2 = sc.nextInt();

        float x = (x1 + x2) / 2;
        float y = (y1 + y2) / 2;

        System.out.println("Binoy's house is located at (" + x + "," + y + ")");
        sc.close();
    }
}
