public class TicTacToeUC4 {// Method to convert slot number to row and column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {
        int slot = 5; // Example slot
        int[] indices = convertSlotToIndex(slot);

        System.out.println("Slot " + slot + " corresponds to:");
        System.out.println("Row: " + indices[0]);
        System.out.println("Column: " + indices[1]);
    }
}
