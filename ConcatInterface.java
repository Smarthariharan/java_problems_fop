import java.util.Scanner;

public class ConcatInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();
        concat c = new concat(a, b);
        c.concate();
    }
}

interface Function {
    void concate();
}

class concat implements Function {
    String a;
    String b;

    public concat(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void concate() {
        System.out.println(a + " " + b);
    }
}
