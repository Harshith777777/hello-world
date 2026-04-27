// UC: Randomly decide starting player and assign symbols

import java.util.Random;

public class uc12 {
    public static void main(String[] args) {

        // Create Random object
        Random random = new Random();

        // Generate random number (0 or 1)
        int tossResult = random.nextInt(2);

        // Game state variables
        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;
        char currentSymbol;

        // Conditional logic based on toss
        if (tossResult == 0) {
            currentPlayer = player1;
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentSymbol = player1Symbol;
        } else {
            currentPlayer = player2;
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentSymbol = player2Symbol;
        }

        // Display results
        System.out.println("Toss Result Completed!");
        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);
        System.out.println("Starting Player: " + currentPlayer);
        System.out.println("Starting Symbol: " + currentSymbol);
    }
}