public class uc19 {

    char[][] board = {
        {'X','O','X'},
        {'X','O','O'},
        {'O','X','X'}
    };

    // Check winner
    boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }

            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol) {
                return true;
            }
        }

        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    // UC19: Check draw
    boolean checkDraw() {

        if (checkWin('X') || checkWin('O')) {
            return false;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        uc19 game = new uc19();

        if (game.checkDraw()) {
            System.out.println("Game Draw!");
        } else {
            System.out.println("Game Not Draw");
        }
    }
}