public class TicTacToeUC5 {
    // Method to validate the user's move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check if row and column are within bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if the selected cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        // Sample board initialization
        char[][] board = {
                {'-', '-', '-'},
                {'-', 'X', '-'},
                {'-', '-', 'O'}
        };

        int row = 1;
        int col = 1;

        if (isValidMove(board, row, col)) {
            System.out.println("Valid move!");
        } else {
            System.out.println("Invalid move!");
        }
    }
}
