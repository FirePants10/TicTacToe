public class TicTacToeUC6 { // Method to place a move on the board
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to display board
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

        // Initialize sample board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Example move
        int row = 1;
        int col = 1;
        char symbol = 'X';

        placeMove(board, row, col, symbol);

        System.out.println("Board after placing move:");
        displayBoard(board);
    }
}
