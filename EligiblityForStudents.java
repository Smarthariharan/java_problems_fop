import java.util.Scanner;

public class EligiblityForStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int id = sc.nextInt();
        float CGPA = sc.nextFloat();
        int arrear = sc.nextInt();

        System.out.println(name);
        System.out.println(id);

        if (CGPA >= 7.5 || arrear > 0) {
            System.out.println("Not Eligible to attend placement");
        } else if (CGPA >= 7.0 || arrear == 0) {
            System.out.println("Eligible to attend placement");
        }

        sc.close();
    }
}
