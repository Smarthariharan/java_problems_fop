
import java.util.Scanner;

// Define the Salinity interface
interface Salinity {
    void Salinity_Meter(double ppt);
}

// Implement the Water class which implements the Salinity interface
class Water implements Salinity {
    public void Salinity_Meter(double ppt) {
        if (ppt < 0.05) {
            System.out.println("Fresh Water");
        } else if (0.05 > ppt && ppt < 0.1) {
            System.out.println("Marginal Water");
        } else if (0.1 > ppt && ppt < 0.2) {
            System.out.println("Brackish Water");
        } else if (0.2 > ppt && ppt < 1.0) {
            System.out.println("Saline Water");
        } else if (1.0 >= ppt && ppt < 3.5) {
            System.out.println("Highly Saline Water");
        } else {
            System.out.println("Brine Water");
        }
    }
}

public class SalinityInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ppt = sc.nextDouble();
        sc.close();

        Water water = new Water();
        water.Salinity_Meter(ppt);
    }
}
