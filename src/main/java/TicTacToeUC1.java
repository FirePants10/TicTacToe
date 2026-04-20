public class TicTacToeUC1 {

    // Method to initialize the board
    public static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Method to display the board
    public static void displayBoard(char[][] board) {
        System.out.println("\nTic-Tac-Toe Board:");
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Main method
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        initializeBoard(board);
        displayBoard(board);
    }
}
