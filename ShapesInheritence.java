import java.util.Scanner;

class Shape {
    public int square(int a) {
        return a * a;
    }

    public int cube(int b) {
        return b * b * b;
    }
}

public class ShapesInheritence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        Shape s = new Shape();
        System.out.println("Enter an integer number: " + "Square of " + a + " is: " + s.square(a));
        System.out.println("Enter an integer number: " + "Cube of " + b + " is: " + s.cube(b));

    }
}
