import java.util.Scanner;

abstract class InnerTitleAbstraction {
    abstract String movieName(String name);
}

class InnerTitleAbstraction_1 extends InnerTitleAbstraction {
    public String movieName(String name) {
        String output = "The title is: " + name;
        return output;
    }
}

public class TitleAbstraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        sc.close();
        InnerTitleAbstraction_1 result = new InnerTitleAbstraction_1();
        String output = result.movieName(movie);
        System.out.println(output);

    }

}
