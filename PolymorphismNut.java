import java.util.Scanner;

class PolymorphismNut {
    abstract class Shape {
        abstract void calculate();
    }

    class length extends Shape {
        private int l;
        private int b;

        public length(int l, int b) {
            this.l = l;
            this.b = b;
        }

        @Override
        void calculate() {
            int area = l * b;
            System.out.println(area);
        }
    }

    class breadth extends Shape {
        private int l;
        private int b;

        public breadth(int l, int b) {
            this.l = l;
            this.b = b;
        }

        @Override
        void calculate() {
            int area = (l * b) / 2;
            System.out.println(area);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        PolymorphismNut shape = new PolymorphismNut();
        length len = shape.new length(l, b);
        breadth br = shape.new breadth(l, b);

        len.calculate();
        br.calculate();

    }
}
