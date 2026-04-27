// UC: Convert slot number to row and column

public class uc14 {

    // Method to convert slot to row and column
    public static int[] getRowAndColumn(int slot) {

        // Convert to zero-based index
        int index = slot - 1;

        // Calculate row and column
        int row = index / 3;
        int column = index % 3;

        // Return as array
        return new int[]{row, column};
    }

    public static void main(String[] args) {

        int slot = 5; // Example input

        int[] position = getRowAndColumn(slot);

        System.out.println("Slot: " + slot);
        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}
