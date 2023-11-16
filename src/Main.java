// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        // create board
        Board board = new Board();
        board.createBoard();

        Player newPlayer = new Player();
        newPlayer.printTokenPos();
    }
}