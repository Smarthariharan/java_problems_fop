import java.util.*;

public class OOPSEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name of the book");
        String bookName = sc.nextLine();

        System.out.println("ISBN Number");
        int isbn = sc.nextInt();

        sc.nextLine(); // Consume the newline character

        System.out.println("Publisher name");
        String pubName = sc.nextLine();

        System.out.println("Price of a book ");
        double price = sc.nextDouble();

        System.out.println("Number of Customers");
        int totalCust = sc.nextInt();

        Customer[] customers = new Customer[totalCust];

        for (int i = 0; i < totalCust; i++) {
            sc.nextLine(); // Consume the newline character

            System.out.println("Details for Customer " + (i + 1));
            System.out.println("Name");
            String name = sc.next();

            System.out.println("Type of Customer (S or I or F)");
            String type = sc.next();

            customers[i] = new Customer(name, type);
        }
        sc.close();
        Book book = new Book(bookName, isbn, pubName, totalCust, price);

        for (int i = 0; i < totalCust; i++) {
            book.totalAmount(customers[i]);
        }

        book.displayBookDetails();
    }
}

class Customer {
    private String custName;
    private String custType;

    public Customer(String name, String type) {
        this.custName = name;
        this.custType = type;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustType() {
        return custType;
    }
}

class Book {
    private String bookName;
    private int isbn;
    private String pubName;
    private int totalCust;
    private double totalAmnt;
    private double price;

    public Book(String name, int isbn, String pubName, int totalCust, double price) {
        this.bookName = name;
        this.isbn = isbn;
        this.pubName = pubName;
        this.totalCust = totalCust;
        this.price = price;
    }

    public double getTotalAmount() {
        return totalAmnt;
    }

    public void totalAmount(Customer customer) {
        if (customer.getCustType().equalsIgnoreCase("S")) {
            totalAmnt += (price * 0.5);
        } else if (customer.getCustType().equalsIgnoreCase("F")) {
            totalAmnt += (price * 0.25);
        } else if (customer.getCustType().equalsIgnoreCase("I")) {
            totalAmnt += (price * 0.1);
        }
    }

    public void displayBookDetails() {
        System.out.println("Book Details are");
        System.out.println("Name of the book : " + bookName);
        System.out.println("ISBN Number of the book : " + isbn);
        System.out.println("Publisher name of the book : " + pubName);
        System.out.println("Number of Customers : " + totalCust);
        System.out.println("Price of a book : " + price);
        System.out.println("Total Amount Received :" + totalAmnt);
    }
}
