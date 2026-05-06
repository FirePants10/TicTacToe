public class TicTacToeUC10 {

    // Method to check if the game is a draw
    public static boolean checkDraw(char[][] board) {

        // Traverse entire board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any empty slot remains, not a draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells left
        return true;
    }

    public static void main(String[] args) {

        // Example board
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        if (checkDraw(board)) {
            System.out.println("The game is a draw!");
        } else {
            System.out.println("Moves still available.");
        }
    }
}