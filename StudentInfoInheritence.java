import java.util.Scanner;

class Student {

}

public class StudentInfoInheritence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        char gender = sc.next().charAt(0);
        int mark = sc.nextInt();
        char grade = sc.next().charAt(0);
        sc.close();
        int m = mark / 5;
        System.out.println("Enter student's basic information:");
        System.out.println("Name:");
        System.out.println("Age:");
        System.out.println("Gender:");
        System.out.println();
        System.out.println("Enter student's result information:");
        System.out.println("Total Marks:");
        System.out.println("Grade:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Total Marks: " + mark);
        System.out.println("Percentage: " + m);
        System.out.println("Grade: " + grade);

    }
}
