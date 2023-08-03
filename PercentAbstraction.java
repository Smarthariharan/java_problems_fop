import java.util.Scanner;

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int subject1, subject2, subject3;

    A(int sub1, int sub2, int sub3) {
        subject1 = sub1;
        subject2 = sub2;
        subject3 = sub3;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3;
        return totalMarks / 3;
    }
}

class B extends Marks {
    private int subject1, subject2, subject3, subject4;

    B(int sub1, int sub2, int sub3, int sub4) {
        subject1 = sub1;
        subject2 = sub2;
        subject3 = sub3;
        subject4 = sub4;
    }

    @Override
    double getPercentage() {
        double totalMarks = subject1 + subject2 + subject3 + subject4;
        return totalMarks / 4;
    }
}

public class PercentAbstraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marksA1 = scanner.nextInt();
        int marksA2 = scanner.nextInt();
        int marksA3 = scanner.nextInt();

        int marksB1 = scanner.nextInt();
        int marksB2 = scanner.nextInt();
        int marksB3 = scanner.nextInt();
        int marksB4 = scanner.nextInt();

        scanner.close();

        A studentA = new A(marksA1, marksA2, marksA3);

        B studentB = new B(marksB1, marksB2, marksB3, marksB4);

        System.out.println("Percentage of Student1:" + (int) studentA.getPercentage());
        System.out.println("Percentage of Student2:" + (int) studentB.getPercentage());
    }
}
