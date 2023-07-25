import java.util.Scanner;

class fact {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;
    }
}

public class FactorialNumberCandO {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        fact factorial = new fact();
        factorial.setNum(num);
        System.out.println(factorial.getNum());
    }
}
