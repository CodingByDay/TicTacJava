import java.util.Scanner;

public class Game implements Logic {


    private Board board;

    private Player player1;
    private Player player2;
    private int counter = 0;
    private int counterX;
    private int counterY;
    private int stop=0;
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    @Override
    public Boolean checkForWinner() {
        char[][] boardToCheck = board.getBoard();


        //Check each row
        for(int i = 0; i < 3; i++) {
            if(boardToCheck[i][0] == boardToCheck[i][1] && boardToCheck[i][1] == boardToCheck[i][2] && boardToCheck[i][0] != Character.MIN_VALUE) {
                return true;
            }
        }

        //Check each column
        for(int j = 0; j < 3; j++) {
            if(boardToCheck[0][j] == boardToCheck[1][j] && boardToCheck[1][j] == boardToCheck[2][j] && boardToCheck[0][j] != Character.MIN_VALUE) {
                return true;
            }
        }

        //Check the diagonals
        if(boardToCheck[0][0] == boardToCheck[1][1] && boardToCheck[1][1] == boardToCheck[2][2] && boardToCheck[0][0] != Character.MIN_VALUE) {
            return true;
        }
        if(boardToCheck[2][0] == boardToCheck[1][1] && boardToCheck[1][1] ==  boardToCheck[0][2] && boardToCheck[2][0] != Character.MIN_VALUE) {
            return true;
        }

        // Otherwise, nobody has not won yet
        return false;

    }

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void Play(int x, int y) throws Exception {

        if(stop==1) {
            throw new Exception();
        }
        counter += 1;
        char[][] obj = board.getBoard();
        if(counter%2==0) {
        obj[x][y] = 'X';
        } else {
            obj[x][y] = 'O';
        }

        this.board.setBoard(obj);
        var isWinDetected = checkForWinner();

        if(!isWinDetected) {
            if(counter%2==0) {
                System.out.println("Player: " + this.player2.getName() + " has played the move it is players: "+ this.player1.getName()+" turn. Good luck!" );
            } else {
                System.out.println("Player: " + this.player1.getName() + " has played the move it is players: "+ this.player2.getName()+" turn. Good luck!" );

            }

        } else {
            if(counter%2==0) {
                System.out.println("Player 2 has won! Congrats " + this.player2.getName()+"!!!");
            } else {
                System.out.println("Player 1 has won! Congrats " + this.player1.getName()+"!!!");

            }
            Scanner scanner = new Scanner(System.in);

            System.out.println("The program is about to exit, please press any key to exit.");

            scanner.next();

            DrawBoard(obj);

            System.exit(0);

        }

        DrawBoard(obj);
    }

    private void DrawBoard(char[][] visualize) {
        for (int row = 0; row < visualize.length; row++)//Cycles through rows
        {
            for (int col = 0; col < visualize[row].length; col++)//Cycles through columns
            {
                System.out.print(visualize[row][col]); //change the %5d to however much space you want
            }
            System.out.println(); //Makes a new row
        }
    }
}
