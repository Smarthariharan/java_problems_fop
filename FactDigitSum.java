// import java.util.Arrays;
// import java.util.Scanner;

// public class FactDigitSum {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         int n = sc.nextInt();
//         int[] fact_array = new int[10];
//         StringBuilder solution = new StringBuilder();
//         int sum = 1;
//         for (int i = 1; i < 10; i++) {
//             sum *= i;
//             fact_array[i] = sum;

//         }
//         sc.close();
//         for (int i = 9; i > 0; i--) {
//             while (n >= fact_array[i]) {
//                 int a = n - fact_array[i];
//                 n = a;
//                 solution.append(i);

//             }
//         }
//         String str = solution.toString();

//         char[] chars = str.toCharArray();

//         Arrays.sort(chars);

//         String sortedStr = new String(chars);

//         System.out.println(sortedStr);
//     }

// }

import java.util.Arrays;
import java.util.Scanner;

public class FactDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] fact_array = new int[10];
        int sum = 1;
        for (int i = 1; i < 10; i++) {
            sum *= i;
            fact_array[i] = sum;
        }
        sc.close();

        StringBuilder solution = findDigits(n, fact_array);
        char[] chars = solution.toString().toCharArray();
        Arrays.sort(chars);
        String sortedStr = new String(chars);
        System.out.println(sortedStr);
    }

    public static StringBuilder findDigits(int n, int[] fact_array) {
        StringBuilder solution = new StringBuilder();
        for (int i = 9; i > 0; i--) {
            if (n >= fact_array[i]) {
                int a = n - fact_array[i];
                n = a;
                solution.append(i);
                break;
            }
        }
        if (n > 0) {
            solution.append(findDigits(n, fact_array));
        }
        return solution;
    }
}
