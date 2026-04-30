public class uc15 {

    char[][] board = new char[3][3];

    // Initialize board
    public uc15() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Validate move
    boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == ' ');
    }

    // UC6: Update board
    boolean updateBoard(int row, int col, char symbol) {
        if (isValidMove(row, col)) {
            board[row][col] = symbol;
            return true;
        } else {
            System.out.println("Invalid move!");
            return false;
        }
    }

    // Display board (FIXED)
    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) {
                System.out.println("---|---|---");
            }
        }
    }

    public static void main(String[] args) {
        uc15 game = new uc15();

        game.updateBoard(0, 0, 'X');
        game.updateBoard(1, 1, 'O');

        game.displayBoard();
    }
}