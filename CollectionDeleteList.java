import java.util.*;

public class CollectionDeleteList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        ArrayList<String> arrayList = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(input, "");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            arrayList.add(token);
        }
        System.out.println("Actual ArrayList:" + arrayList);
        arrayList.clear();
        System.out.println("After clear ArrayList:" + arrayList);
    }
}
