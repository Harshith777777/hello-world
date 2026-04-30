import java.util.Random;

public class uc16 {

    char[][] board = new char[3][3];
    Random rand = new Random();

    // Initialize board
    public uc16() {
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

    // Update board
    void updateBoard(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Convert slot (1–9) → row & col
    int[] convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // UC7: Computer random move
    void computerMove() {
        int slot;
        int row, col;

        while (true) {
            slot = rand.nextInt(9) + 1;   // 🎯 1–9
            int[] pos = convertSlot(slot);

            row = pos[0];
            col = pos[1];

            if (isValidMove(row, col)) {
                updateBoard(row, col, 'O');
                System.out.println("Computer chose slot: " + slot);
                break;  // ✅ valid move found
            }
        }
    }

    // Display board
    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public static void main(String[] args) {
        uc16 game = new uc16();

        game.computerMove();  // Computer plays
        game.displayBoard();
    }
}