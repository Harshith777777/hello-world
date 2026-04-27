// UC: Get slot number from user using method

import java.util.Scanner;

public class Tuc13 {

    // Method to get user input
    public static int getUserSlot() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = input.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        // Call method
        int selectedSlot = getUserSlot();

        // Display chosen slot
        System.out.println("You selected slot: " + selectedSlot);
    }
}