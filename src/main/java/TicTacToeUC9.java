public class TicTacToeUC9 {

    // Method to check if the given symbol has won
    public static boolean checkWin(char[][] board, char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                    board[i][1] == symbol &&
                    board[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == symbol &&
                    board[1][i] == symbol &&
                    board[2][i] == symbol) {
                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
                board[1][1] == symbol &&
                board[2][2] == symbol) {
            return true;
        }

        // Check anti-diagonal
        if (board[0][2] == symbol &&
                board[1][1] == symbol &&
                board[2][0] == symbol) {
            return true;
        }

        // No winning condition met
        return false;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X'},
                {'-', 'O', '-'},
                {'O', '-', 'O'}
        };

        char playerSymbol = 'X';

        if (checkWin(board, playerSymbol)) {
            System.out.println("Player " + playerSymbol + " wins!");
        } else {
            System.out.println("No winner yet.");
        }
    }
}