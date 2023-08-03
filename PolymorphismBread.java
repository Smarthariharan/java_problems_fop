import java.util.Scanner;

class PolymorphismBread {
    public void calculateCalorie(int i) {
        double cal = 74 * i;
        double energy = 4.1868 * cal;
        System.out.printf("%.3f", energy);
        System.out.print(" kJ of energy generated from ");
        System.out.printf("%.3f", cal);
        System.out.print(" calories");

    }

    public void calculateCalorie(int i, int j) {
        double cal = (74 * i) + (26 * j);

        double energy = 4.1868 * cal;
        System.out.printf("%.3f", energy);
        System.out.print(" kJ of energy generated from ");
        System.out.printf("%.3f", cal);
        System.out.print(" calories");

    }

    public void calculateCalorie(int i, int j, int k) {
        double cal = (74 * i) + (102 * k) + (26 * j);

        double energy = 4.1868 * cal;
        System.out.printf("%.3f", energy);
        System.out.print(" kJ of energy generated from ");
        System.out.printf("%.3f", cal);
        System.out.print(" calories");

    }

    public static void main(String args[]) {
        // Try out your code here
        PolymorphismBread m = new PolymorphismBread();
        System.out.println("1.Bread only");
        System.out.println("2.Bread+Jam");
        System.out.println("3.Bread+Jam+Butter");
        System.out.println("Enter the choice");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i, j, k;
        switch (n) {
            case 1:
                System.out.println("Enter the number of Slice of bread");
                i = scan.nextInt();
                m.calculateCalorie(i);
                break;
            case 2:
                System.out.println("Enter the number of Slice of bread");
                i = scan.nextInt();
                System.out.println("Enter the number teaspoon of Jam");
                j = scan.nextInt();
                m.calculateCalorie(i, j);
                break;
            case 3:
                System.out.println("Enter the number of Slice of bread");
                i = scan.nextInt();
                System.out.println("Enter the number teaspoon of Jam");
                j = scan.nextInt();
                System.out.println("Enter the number teaspoon of Butter");
                k = scan.nextInt();

                m.calculateCalorie(i, j, k);
                break;
            default:
                System.out.println("0.000 kJ of energy generated from 0.000 calories");

        }
        scan.close();

    }
}