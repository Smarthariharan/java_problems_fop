import java.util.Scanner;

public class StudentDetailsCandO {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int mark = sc.nextInt();
        // float result =;
        sc.close();

        System.out.println("Enter name:");
        System.out.println("Enter roll number:");
        System.out.println("Enter total marks outof 500:");
        System.out.println("Student details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + age);
        System.out.println("Total: " + mark);
        System.out.println("Percentage: " + (float) mark / 5);

    }
}
