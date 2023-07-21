import java.util.Scanner;

public class SubsetAtIndex {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.next();
        int index = sc.nextInt();
        sc.close();

        StringBuilder sb = new StringBuilder(str);

        if (index < 0 || index > str.length()) {
            System.out.println(str); // Print the original string when index is invalid
        } else {
            sb.insert(index, " " + word);
            System.out.println(sb.toString());
        }
    }
}
