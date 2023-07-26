import java.util.Scanner;

class Shape {
    int length, breadth, height, radius;

    Shape() {
    }

    Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    Shape(int radius) {
        this.radius = radius;
    }

    Shape(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int calculateVolumeOfCube() {
        return length * breadth * height;
    }

    public float calculateVolumeOfSphere() {
        return (4.0f / 3.0f) * (float) Math.PI * radius * radius * radius;
    }

    public float calculateVolumeOfCylinder() {
        return (float) Math.PI * radius * radius * height;
    }
}

public class VolumesConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Cube");
        System.out.println("2.Sphere");
        System.out.println("3.Cylinder");
        System.out.println("Enter the choice");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("length");
                int length = scanner.nextInt();
                System.out.println("breadth");
                int breadth = scanner.nextInt();
                System.out.println("height");
                int height = scanner.nextInt();

                Shape cube = new Shape(length, breadth, height);
                int cubeVolume = cube.calculateVolumeOfCube();
                System.out.println("Area of Cube is " + cubeVolume);
                break;
            case 2:
                System.out.println("radius");
                int radiusSphere = scanner.nextInt();

                Shape sphere = new Shape(radiusSphere);
                double sphereVolume = Math.floor(sphere.calculateVolumeOfSphere());
                System.out.println("Area of Sphere is " + sphereVolume);
                break;
            case 3:
                System.out.println("radius");
                int radiusCylinder = scanner.nextInt();
                System.out.println("height");
                int heightCylinder = scanner.nextInt();

                Shape cylinder = new Shape(radiusCylinder, heightCylinder);
                double cylinderVolume = Math.floor(cylinder.calculateVolumeOfCylinder());
                System.out.printf("Area of Cylinders is " + cylinderVolume);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
