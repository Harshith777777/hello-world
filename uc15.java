// UC: Validate if move is within bounds and cell is empty

public class uc15 {

    // Method to check valid move
    public static boolean isValidMove(char[][] board, int row, int column) {

        int boardSize = 3;

        // Check boundaries
        if (row < 0 || row >= boardSize || column < 0 || column >= boardSize) {
            return false;
        }

        // Check if cell is empty
        if (board[row][column] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
            {'-', '-', '-'},
            {'-', 'X', '-'},
            {'-', '-', '-'}
        };

        int row = 1;
        int column = 1;

        boolean result = isValidMove(board, row, column);

        if (result) {
            System.out.println("Valid Move");
        } else {
            System.out.println("Invalid Move");
        }
    }
}
