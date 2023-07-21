import java.util.Scanner;

public class playingWithShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int l = sc.nextInt();

        int d = r * 2;

        if (d < l || d == l) {
            System.out.println("circle can be inside a Square");
        } else {
            System.out.println("circle cannot be inside a Square");
        }

        sc.close();
    }
}
