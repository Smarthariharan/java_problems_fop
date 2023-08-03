import java.util.Scanner;

public class PolymorphismDora {
    abstract class Shape {
        abstract void add();
    }

    class Method1 extends Shape {
        private int a;
        private int b;

        public Method1(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        void add() {
            int add = a + b;
            System.out.println(add);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        PolymorphismDora met = new PolymorphismDora();
        Method1 m = met.new Method1(a, b);
        m.add();

    }
}
