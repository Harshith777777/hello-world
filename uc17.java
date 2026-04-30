import java.util.*;

public class uc17 {

    char[][] board = new char[3][3];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    uc17() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == ' ';
    }

    void updateBoard(int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    int[] convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    void humanMove() {
        while (true) {
            System.out.print("Enter slot 1-9: ");
            int slot = sc.nextInt();

            if (slot < 1 || slot > 9) {
                System.out.println("Invalid slot!");
                continue;
            }

            int[] pos = convertSlot(slot);

            if (isValidMove(pos[0], pos[1])) {
                updateBoard(pos[0], pos[1], 'X');
                break;
            } else {
                System.out.println("Cell already filled!");
            }
        }
    }

    void computerMove() {
        while (true) {
            int slot = rand.nextInt(9) + 1;
            int[] pos = convertSlot(slot);

            if (isValidMove(pos[0], pos[1])) {
                updateBoard(pos[0], pos[1], 'O');
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol)
                return true;

            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)
                return true;
        }

        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)
            return true;

        return false;
    }

    boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ')
                    return false;
            }
        }
        return true;
    }

    void displayBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    void playGame() {
        boolean gameOver = false;
        boolean humanTurn = true;

        while (!gameOver) {
            displayBoard();

            if (humanTurn) {
                System.out.println("Human turn");
                humanMove();

                if (checkWin('X')) {
                    displayBoard();
                    System.out.println("Human wins!");
                    gameOver = true;
                }
            } else {
                System.out.println("Computer turn");
                computerMove();

                if (checkWin('O')) {
                    displayBoard();
                    System.out.println("Computer wins!");
                    gameOver = true;
                }
            }

            if (!gameOver && checkDraw()) {
                displayBoard();
                System.out.println("Game draw!");
                gameOver = true;
            }

            humanTurn = !humanTurn; // Turn switching
        }
    }

    public static void main(String[] args) {
        uc17 game = new uc17();
        game.playGame();
    }
}