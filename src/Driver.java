import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private Player player1;
    private Player player2;

    public static void main(String[] args) throws Exception {
        var data = PreparePlayers();

        char[][] dimension = new char[3][3];
        Board board = new Board("First match", dimension);

        Game game = new Game(board, data.get(0), data.get(1));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter the X position");
            int x = scanner.nextInt();


            System.out.println("Please enter the Y position");
            int y = scanner.nextInt();

            try {
            game.Play(x,y);

            } catch(Exception err) {
                System.exit(0);
            }
        }


    }

    private static ArrayList<Player> PreparePlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1 please tell us your awesome name.");
        String name1 = scanner.next();

        System.out.println("Player 1 please tell us your awesome surname.");
        String surname1 = scanner.next();

        System.out.println("Player 1 please tell us your year of birth.");
        String yearOfBirth1 = scanner.next();



        System.out.println("Player 2 please tell us your awesome name.");
        String name2 = scanner.next();

        System.out.println("Player 2 please tell us your awesome surname.");
        String surname2 = scanner.next();

        System.out.println("Player 2 please tell us your year of birth.");
        String yearOfBirth2 = scanner.next();

        Player first = new Player(name1, surname1, Integer.parseInt(yearOfBirth1));
        Player second = new Player(name2, surname2, Integer.parseInt(yearOfBirth2));

        ArrayList<Player> data = new ArrayList<>();

        data.add(first);
        data.add(second);

        return data;

    }
}
