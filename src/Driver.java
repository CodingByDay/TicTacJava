import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private Player player1;
    private Player player2;

    public static void main(String[] args) throws Exception {
        ArrayList<Player> data = PreparePlayers();

        char[][] dimension = {{'|','|','|' },{'|','|','|' },{'|','|','|' }};


        Board board = new Board("First match", dimension);

        Game game = new Game(board, data.get(0), data.get(1));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            try {
            game.Play();

            } catch(Exception err) {
                System.exit(0);
            }
        }


    }

    private static ArrayList<Player> PreparePlayers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1 please tell us your  name.");
        String name1 = scanner.next();

        System.out.println(name1 +" please tell us your surname.");
        String surname1 = scanner.next();

        System.out.println(name1 + " " + surname1 + " " + "please tell us your year of birth.");
        String yearOfBirth1 = scanner.next();

        System.out.println("Thank you " + name1 + "!");

        System.out.println("Player 2 please tell us your name.");
        String name2 = scanner.next();

        System.out.println(name2 +" please tell us your surname.");
        String surname2 = scanner.next();

        System.out.println(name2 + " " + surname2 + " " + "please tell us your year of birth.");
        String yearOfBirth2 = scanner.next();

        Player first = new Player(name1, surname1, Integer.parseInt(yearOfBirth1));
        Player second = new Player(name2, surname2, Integer.parseInt(yearOfBirth2));

        ArrayList<Player> data = new ArrayList<>();

        data.add(first);
        data.add(second);

        return data;

    }
}
