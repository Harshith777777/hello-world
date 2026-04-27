// UC: Display Empty Tic-Tac-Toe Board

public class uc11 {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        char emptyCell = '-';

        // Initialize board
        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                board[row][column] = emptyCell;
            }
        }

        // Print board
        System.out.println("Tic-Tac-Toe Board:");

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }
}
