import java.util.Random;

public class TicTacToeUC7 {

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-';
    }

    // Convert slot (1–9) to row/col
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Computer random move
    public static void computerMove(char[][] board, char computerSymbol) {
        Random random = new Random();
        int slot;
        int row, col;

        do {
            slot = random.nextInt(9) + 1; // 1–9
            int[] indices = convertSlotToIndex(slot);
            row = indices[0];
            col = indices[1];
        } while (!isValidMove(board, row, col));

        placeMove(board, row, col, computerSymbol);

        System.out.println("Computer selected slot: " + slot);
    }

    // Display board
    public static void displayBoard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char computerSymbol = 'O';

        computerMove(board, computerSymbol);

        System.out.println("Board after computer move:");
        displayBoard(board);
    }
}