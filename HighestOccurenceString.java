import java.util.Arrays;
import java.util.Scanner;

public class HighestOccurenceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        int max = 0;
        char maxChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                maxChar = arr[i];
            }
        }

        System.out.println(maxChar + " " + max);
    }
}
