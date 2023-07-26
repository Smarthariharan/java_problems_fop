import java.util.Scanner;

class Shape {
    int length, breadth, height;

    Shape(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int calculateVolume() {
        return length * breadth * height;
    }

    public int calculatePerimeter() {
        return 4 * (length + breadth + height);
    }

}

public class PerimeterAndVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        sc.close();
        Shape peri = new Shape(l, b, h);
        int perimeter = peri.calculatePerimeter();
        System.out.println("Perimeter:" + perimeter);

        Shape vol = new Shape(l, b, h);
        int volume = vol.calculateVolume();
        System.out.println("Volume:" + volume);
    }
}
