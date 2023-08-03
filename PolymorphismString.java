import java.util.Scanner;

public class PolymorphismString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (sc.hasNext()) {
            int n = sc.nextInt();
            num += n;
        }
        System.out.println(num);
        sc.close();
    }
}