import java.util.Scanner;

class InnerElectricityBillCandO {
    private int num;
    private String name;
    private int unit;

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;

    }

    public int getUnit() {
        int result = 0;
        if (unit <= 100) {
            result = (int) (unit * 1.20);
            return (int) (result);
        } else if (num <= 300) {
            int number = (unit - 100) * 2;
            result = (int) (number + (unit * 1.20));
            return (int) (result);
        } else if (num > 300) {
            int number1 = (unit - 100) * 2;
            double number = (unit - 200) * 1.20;
            int number2 = (unit - 300) * 3;
            result = (int) (number + number1 + number2);
            return (int) (result);
        }
        return 0;
        // int cost = 0;
        // if (unit <= 100) {
        // cost = (int) (unit * 1.20);
        // } else if (unit <= 300) {
        // cost = 100 * 120 + (int) ((unit - 100) * 2);
        // } else {
        // cost = 100 * 120 + 200 * 2 + (int) ((unit - 300) * 3);
        // }
        // return cost;
    }
}

public class ElectricityBillCandO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bill = sc.nextInt();
        String name = sc.next();
        int unit = sc.nextInt();
        sc.close();

        InnerElectricityBillCandO billing = new InnerElectricityBillCandO();
        billing.setNum(bill);
        billing.setName(name);
        billing.setUnit(unit);

        System.out.println(billing.getNum());
        System.out.println(billing.getName());
        System.out.println(unit);
        System.out.println(billing.getUnit());

    }
}
