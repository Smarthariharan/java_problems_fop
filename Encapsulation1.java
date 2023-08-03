import java.util.Scanner;

public class Encapsulation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int project = sc.nextInt();
        sc.close();
        Data d = new Data(name, project);
        System.out.println("Name: " + d.getName());
        System.out.println("Project: " + d.getProject());
    }
}

class Data {
    private String name;
    private int project;

    public Data(String name, int project) {
        this.name = name;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public int getProject() {
        return project;
    }
}
