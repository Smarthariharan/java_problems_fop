import java.util.Scanner;

public class VolumeAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        Volume v = new Volume1();
        if (type.equals("Sphere")) {
            int a = sc.nextInt();
            System.out.print("The volume of the sphere is ");
            System.out.printf("%.2f", v.findSphere(a));
        } else if (type.equals("Cube")) {
            int a = sc.nextInt();
            System.out.print("The volume of the cube is ");
            System.out.printf("%.2f", v.findCube(a));
        } else if (type.equals("Cuboid")) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.print("The volume of the cuboid is ");
            System.out.printf("%.2f", v.findCuboid(a, b, c));
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();

    }
}

abstract class Volume {
    abstract double findSphere(int a);

    abstract double findCube(int a);

    abstract double findCuboid(int a, int b, int c);
}

class Volume1 extends Volume {
    public double findSphere(int a) {
        return (4 * 3.14 * a * a * a) / 3;
    }

    public double findCube(int a) {
        return (a * a * a);
    }

    public double findCuboid(int a, int b, int c) {
        return c * b * a;
    }
}
