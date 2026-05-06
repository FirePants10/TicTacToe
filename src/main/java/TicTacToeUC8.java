import java.util.Random;
import java.util.Scanner;

public class TicTacToeUC8 {

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

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 &&
                col >= 0 && col < 3 &&
                board[row][col] == '-';
    }

    // Convert slot to row/column
    public static int[] convertSlotToIndex(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // Place move
    public static void placeMove(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // User move
    public static void userMove(char[][] board, char userSymbol) {
        Scanner scanner = new Scanner(System.in);
        int slot, row, col;

        do {
            System.out.print("Enter your move (1-9): ");
            slot = scanner.nextInt();

            int[] indices = convertSlotToIndex(slot);
            row = indices[0];
            col = indices[1];

        } while (!isValidMove(board, row, col));

        placeMove(board, row, col, userSymbol);
    }

    // Computer move
    public static void computerMove(char[][] board, char computerSymbol) {
        Random random = new Random();
        int slot, row, col;

        do {
            slot = random.nextInt(9) + 1;

            int[] indices = convertSlotToIndex(slot);
            row = indices[0];
            col = indices[1];

        } while (!isValidMove(board, row, col));

        System.out.println("Computer chose slot: " + slot);
        placeMove(board, row, col, computerSymbol);
    }

    // Check win
    public static boolean checkWin(char[][] board, char symbol) {

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) ||
                    (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol)) {
                return true;
            }
        }

        return (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol);
    }

    // Check draw
    public static boolean checkDraw(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char userSymbol = 'X';
        char computerSymbol = 'O';
        boolean userTurn = true;
        boolean gameOver = false;

        System.out.println("Starting Tic-Tac-Toe!");

        while (!gameOver) {

            displayBoard(board);

            if (userTurn) {
                userMove(board, userSymbol);

                if (checkWin(board, userSymbol)) {
                    displayBoard(board);
                    System.out.println("User wins!");
                    gameOver = true;
                }

            } else {
                computerMove(board, computerSymbol);

                if (checkWin(board, computerSymbol)) {
                    displayBoard(board);
                    System.out.println("Computer wins!");
                    gameOver = true;
                }
            }

            if (!gameOver && checkDraw(board)) {
                displayBoard(board);
                System.out.println("It's a draw!");
                gameOver = true;
            }

            userTurn = !userTurn;
        }
    }
}