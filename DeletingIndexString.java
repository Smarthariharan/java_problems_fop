import java.util.Scanner;

public class DeletingIndexString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        sc.close();
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i != n) {
                string.append(str.charAt(i));

            } else {
                continue;
            }

        }
        System.out.print(string.toString());
    }

}
