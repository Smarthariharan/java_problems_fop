import java.util.Scanner;

class PolymorphismIndoorGames {
    abstract class Game {
        abstract void calculateArea();
    }

    class Carrom extends Game {
        private int side;

        public Carrom(int side) {
            this.side = side;
        }

        @Override
        void calculateArea() {
            int area = side * side;
            System.out.println(area);
        }
    }

    class TT extends Game {
        private int length;
        private int breadth;

        public TT(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        void calculateArea() {
            int area = length * breadth;
            System.out.println(area);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        sc.close();

        PolymorphismIndoorGames indoorGame = new PolymorphismIndoorGames();
        Game carrom = indoorGame.new Carrom(side);
        Game ttTable = indoorGame.new TT(length, breadth);

        carrom.calculateArea();
        ttTable.calculateArea();

    }
}
