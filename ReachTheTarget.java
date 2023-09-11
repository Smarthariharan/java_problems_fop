import java.util.*;

class ReachTheTarget {
    public static boolean find(int a, int b, int c, int d, int count) {
        if (count > d)
            return false;
        if (a == c)
            return true;
        if (find(a + b, b, c, d, count + 1))
            return true;
        else if (find(a - b, b, c, d, count + 1))
            return true;

        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            sc.close();
            if (find(a, b, c, d, 0)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}