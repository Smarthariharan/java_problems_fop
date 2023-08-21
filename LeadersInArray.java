public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 9, 15, 7, 3, 1, 12 };

        // time complexity is O(n * n) worst case

        // for (int i = 0; i < arr.length; i++) {
        // boolean match = true;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] < arr[j]) {
        // match = false;
        // break;
        // }
        // }
        // if (match) {
        // System.out.print(arr[i] + " ");
        // }
        // }

        // time complexity is O(n) best case

        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.print(max + " ");
            }

        }

    }
}
