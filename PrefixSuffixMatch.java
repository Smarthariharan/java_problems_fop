public class PrefixSuffixMatch {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 0, 3, 1, 5 };

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        // System.out.println(sum);
        int max = 0;
        int prefix = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix += arr[i];

            if (prefix == sum && max < sum) {
                max = sum;
            }
            sum -= arr[i];
        }
        System.out.println(max);
    }
}
