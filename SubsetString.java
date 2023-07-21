import java.util.Arrays;
import java.util.Scanner;

public class SubsetString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        first = first.toLowerCase();
        int n = first.length();
        String[] arr = new String[n * (n + 1) / 2];
        int count = 0;
        sc.close();
        System.out.println("Sorted Substring");
        for (int j = 0; j < first.length(); j++) {
            for (int i = j; i < first.length(); i++) {
                arr[count] = first.substring(j, i + 1);
                count++;
            }
        }
        Arrays.sort(arr);
        for (String i : arr) {
            System.out.println(i);
        }
    }

}
