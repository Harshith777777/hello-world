public class uc18 {

    char[][] board = {
        {'X','X','X'},
        {'O',' ','O'},
        {' ',' ',' '}
    };

    boolean checkWin(char symbol) {

        for (int i = 0; i < 3; i++) {

            // Row check
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }

            // Column check
            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        // Diagonal 1
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Diagonal 2
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        uc18 game = new uc18();

        if (game.checkWin('X')) {
            System.out.println("X Wins!");
        } else {
            System.out.println("No Winner");
        }
    }
}