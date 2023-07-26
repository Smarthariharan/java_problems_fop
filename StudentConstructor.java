import java.util.Scanner;

public class StudentConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int id = sc.nextInt();
        String depart = sc.next();
        System.out.println("Name");
        System.out.println("Id");
        System.out.println("Department");
        sc.close();
        Department department = new Department(id, depart);

        Student originalStudent = new Student(id, name, department);
        System.out.println("Original:- " + originalStudent);

        Student clonedStudent = new Student(originalStudent);
        System.out.println("Duplicate:- " + clonedStudent);
    }
}

class Student {
    private String name;
    private int id;
    private Department department;

    public Student(int id, String name, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Copy Constructor
    public Student(Student originalStudent) {
        this.name = originalStudent.getName();
        this.id = originalStudent.getId();
        this.department = new Department(originalStudent.getDepartment());
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public String toString() {
        return "\nId: " + id + "\nName: " + name + "\n" + department;
    }
}

class Department {
    private String name;
    private int id;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Copy Constructor
    public Department(Department oldDepartment) {
        this.id = oldDepartment.getId();
        this.name = oldDepartment.getName();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Department Id: " + id + "\nDepartment: " + name;
    }
}
