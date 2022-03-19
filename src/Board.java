public class Board {


    private String version;
    private char[][] board;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public Board(String version, char[][] board) {
        this.version = version;
        this.board = board;
    }


}
