import java.util.*;

public class DuplicatesFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int[] uniqueArr = removeDuplicates(arr);
        for (int num : uniqueArr) {
            System.out.println(num);
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }

        int[] uniqueArr = new int[uniqueList.size()];
        for (int i = 0; i < uniqueList.size(); i++) {
            uniqueArr[i] = uniqueList.get(i);
        }

        return uniqueArr;
    }

}
