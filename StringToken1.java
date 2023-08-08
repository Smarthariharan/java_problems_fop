import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringTokenizer st = new StringTokenizer(str, " ");

        List<String> list = new ArrayList<>();
        ArrayList<String> arr = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
            arr.add(st.nextToken());
        }

        System.out.print("List:");
        System.out.println(list);
        System.out.print("ArrayList:");
        System.out.println(arr);
    }
}