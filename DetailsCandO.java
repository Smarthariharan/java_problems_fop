import java.util.Scanner;

class InnerDetailsCandO {
    private String name;
    private String district;
    private String number;
    private String mail;
    private String aadhar;
    private String Anum;

    public void setName(String name) {
        this.name = name;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public void setAnum(String Anum) {
        this.Anum = Anum;
    }

    public String getName() {
        return name;
    }

    public String getDistrict() {
        return district;
    }

    public String getNumber() {
        return number;
    }

    public String getMail() {
        return mail;
    }

    public String getAadhar() {
        return aadhar;
    }

    public String getAnum() {
        return Anum;
    }
}

public class DetailsCandO {
    /**
     * InnerDetailsCandO
     */

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String district = sc.nextLine();
        String number = sc.nextLine();
        String mail = sc.nextLine();
        String aadhar = sc.nextLine();
        String Anum = sc.nextLine();
        sc.close();

        InnerDetailsCandO details = new InnerDetailsCandO();
        details.setName(name);
        details.setDistrict(district);
        details.setNumber(number);
        details.setMail(mail);
        details.setAadhar(aadhar);
        details.setAnum(Anum);

        System.out.println("Registration");
        System.out.println("Enter your name");
        System.out.println("Enter your address");
        System.out.println("Contact Number");
        System.out.println("E-Mail ID");
        System.out.println("Enter proof type");
        System.out.println("Enter proof id");
        System.out.println("Customer Details");
        System.out.println(details.getName());
        System.out.println(details.getDistrict());
        System.out.println(details.getNumber());
        System.out.println(details.getMail());
        System.out.println(details.getAadhar());
        System.out.println(details.getAnum());
        System.out.println("Thank you for registering. Your id is 1...");

    }
}
