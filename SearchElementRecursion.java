import java.util.Scanner;

public class SearchElementRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int element = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (searchElement(arr, n, element, 0)) {
            System.out.println(element);
        } else {
            System.out.println("The number is not present in the list");
        }

        sc.close();
    }

    public static boolean searchElement(int[] arr, int n, int element, int currentIndex) {
        if (currentIndex >= n) {
            return false;
        }

        if (arr[currentIndex] == element) {
            return true;
        }

        return searchElement(arr, n, element, currentIndex + 1);
    }
}
