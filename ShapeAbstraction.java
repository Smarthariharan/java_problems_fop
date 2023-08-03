import java.util.Scanner;

abstract class Shape {
    abstract int rectangle(int num);

    abstract int circle(int num);
}

class Shapes extends Shape {
    public int rectangle(int num) {

        return num;
    }

    public int circle(int num) {

        return num;
    }

}

public class ShapeAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println("Rectangle");
        Shapes s = new Shapes();
        int sh = s.rectangle(num);
        System.out.println("The given input is " + sh);

        System.out.println("Circle");
        int sha = s.circle(num);
        System.out.println("The given input is " + sha);

    }
}
