import java.util.Random;

public class TicTacToeUC2 {

    static char userSymbol;
    static char computerSymbol;
    static char currentPlayer;

    // Function to perform toss
    public static void toss() {
        Random rand = new Random();
        int tossResult = rand.nextInt(2); // 0 or 1

        if (tossResult == 0) {
            currentPlayer = 'U'; // User starts
            userSymbol = 'X';
            computerSymbol = 'O';
            System.out.println("User won the toss!");
        } else {
            currentPlayer = 'C'; // Computer starts
            computerSymbol = 'X';
            userSymbol = 'O';
            System.out.println("Computer won the toss!");
        }

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }

    public static void main(String[] args) {
        toss();

        if (currentPlayer == 'U') {
            System.out.println("User plays first.");
        } else {
            System.out.println("Computer plays first.");
        }
    }
}
