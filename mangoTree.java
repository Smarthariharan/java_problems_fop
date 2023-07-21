import java.util.Scanner;

public class mangoTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int tree = sc.nextInt();

        if (tree % column == 2 || tree / column == column - 1) {
            System.out.println("It is a mango tree");
        } else {
            System.out.println("It is not a mango tree");
        }
        sc.close();
    }
}
