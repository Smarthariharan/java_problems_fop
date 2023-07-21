import java.util.Scanner;

public class MangoTree_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        System.out.print("Enter the tree number: ");
        int treeNumber = scanner.nextInt();
        scanner.close();

        if (treeNumber <= columns || treeNumber % columns == 1 || treeNumber % columns == 0
                || treeNumber > (rows - 1) * columns) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
