import java.util.LinkedList;
import java.util.Scanner;

public class CollectionLinkedList {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        LinkedList<String> ll = new LinkedList<>();

        for (int i = 0; i < n; i++)
            ll.add(scan.nextLine());

        System.out.println("Actual LinkedList:" + ll);

        int m = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < m; i++)
            ll.add(scan.nextLine());
        scan.close();

        System.out.println("After Copy:" + ll);
    }

}
