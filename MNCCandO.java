import java.util.Scanner;
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static Employee acceptData(int i, Scanner scan) {
        System.out.println("Enter Data for Employee " + i);
        System.out.println("Enter Staff Id : ");
        int id = scan.nextInt();
        System.out.println("Enter Staff Name : ");
        String name = scan.next();
        System.out.println("Enter Salary : ");
        int salary = scan.nextInt();
        Employee emp = new Employee(id, name, salary);
        return emp;
    }

    public static int display(Scanner scan) {
        System.out.println("1. Accept Data ");
        System.out.println("2. Display Data ");
        System.out.println("3. Sort Data by Name ");
        System.out.println("4. Exit:");
        System.out.println("Enter Your Choice :");
        int choice = scan.nextInt();

        return choice;
    }

}

public class MNCCandO {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter No.of Records You Want :");
        int n = scan.nextInt();
        int choice = Employee.display(scan);
        ArrayList<Employee> emplyes = new ArrayList<>();
        while (choice != 4) {
            if (choice == 1) {
                for (int i = 1; i <= n; i++) {
                    Employee emp = Employee.acceptData(i, scan);
                    emplyes.add(emp);
                }
                choice = Employee.display(scan);

            } else if (choice == 2) {
                if (emplyes.size() == 0) {
                    System.out.println("No data is accepted");
                    choice = Employee.display(scan);
                } else {
                    for (int i = 0; i < emplyes.size(); i++) {
                        Employee a = emplyes.get(i);
                        System.out.println("Staff Id : " + a.id);
                        System.out.println("Name : " + a.name);
                        System.out.println("Salary : " + a.salary);
                        System.out.println("");

                    }
                    choice = Employee.display(scan);
                }
            } else if (choice == 3) {
                System.out.println("Data is Sorted!!!");
                System.out.println("");
                choice = Employee.display(scan);
            }
        }

    }
}
