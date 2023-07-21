import java.util.Scanner;

public class InsertingSubset {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        // String word = sc.next();
        // int index = sc.nextInt();
        // sc.close();
        // StringBuilder string = new StringBuilder();
        // for (int i = 0; i < str.length(); i++) {
        // if (i == index) {
        // string.append(" " + word + " ");
        // } else {
        // string.append(str.charAt(i));
        // }
        // }
        // System.out.println(string.toString());

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = sc.next();
        int index = sc.nextInt();
        sc.close();
        StringBuilder sb = new StringBuilder(str);
        sb.insert(index, " " + word);
        System.out.println(sb.toString());
    }
}
