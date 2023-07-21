import java.util.Scanner;

public class WhiteSpacesString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        input.close();
        String stringWithoutSpaces = str.replaceAll("\\s+", "");
        System.out.println(stringWithoutSpaces);
    }
}
