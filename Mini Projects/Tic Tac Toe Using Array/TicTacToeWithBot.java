import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeWithBot {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
    }

    // ================= GAME START =================
    private static void startGame() {
        System.out.println("\n**** GAME START ****\n");

        char[][] grid = new char[3][3];
        for (char[] row : grid) {
            Arrays.fill(row, ' ');
        }

        while (true) {

            // Human move (X)
            if (!playerMove(grid)) continue;
            if (checkWinner(grid)) return;

            // Bot move (O)
            botMove(grid);
            if (checkWinner(grid)) return;
        }
    }

    // ================= HUMAN MOVE =================
    private static boolean playerMove(char[][] grid) {
        displayGrid(grid);
        System.out.print("\nEnter your move (A1, B2, C3): ");
        String input = sc.next().toUpperCase();

        if (input.length() != 2) {
            System.out.println("Invalid input!");
            return false;
        }

        int i = input.charAt(0) - 'A';
        int j = input.charAt(1) - '1';

        if (i < 0 || i > 2 || j < 0 || j > 2) {
            System.out.println("Invalid position!");
            return false;
        }

        if (grid[i][j] != ' ') {
            System.out.println("Cell already filled!");
            return false;
        }

        grid[i][j] = 'X';
        return true;
    }

    // ================= PERFECT BOT =================
    private static void botMove(char[][] grid) {
        System.out.println("\nBot (O) is thinking...");

        // 1️⃣ Win if possible
        if (tryMove(grid, 'O')) return;

        // 2️⃣ Block opponent
        if (tryMove(grid, 'X')) return;

        // 3️⃣ Take center
        if (grid[1][1] == ' ') {
            grid[1][1] = 'O';
            return;
        }

        // 4️⃣ Take corners
        int[][] corners = {{0,0},{0,2},{2,0},{2,2}};
        for (int[] c : corners) {
            if (grid[c[0]][c[1]] == ' ') {
                grid[c[0]][c[1]] = 'O';
                return;
            }
        }

        // 5️⃣ Take any free cell
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] == ' ') {
                    grid[i][j] = 'O';
                    return;
                }
            }
        }
    }

    // ================= TRY WIN / BLOCK =================
    private static boolean tryMove(char[][] grid, char player) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (grid[i][j] == ' ') {
                    grid[i][j] = player;

                    if (isWinning(grid, player)) {
                        if (player == 'X') grid[i][j] = 'O';
                        return true;
                    }

                    grid[i][j] = ' ';
                }
            }
        }
        return false;
    }

    // ================= WIN CHECK =================
    private static boolean isWinning(char[][] g, char p) {
        for (int i = 0; i < 3; i++) {
            if (g[i][0] == p && g[i][1] == p && g[i][2] == p) return true;
            if (g[0][i] == p && g[1][i] == p && g[2][i] == p) return true;
        }

        return (g[0][0] == p && g[1][1] == p && g[2][2] == p) ||
               (g[0][2] == p && g[1][1] == p && g[2][0] == p);
    }

    // ================= RESULT CHECK =================
    private static boolean checkWinner(char[][] grid) {

        if (isWinning(grid, 'X')) {
            displayGrid(grid);
            System.out.println("\n YOU WIN!");
            startGame();
            return true;
        }

        if (isWinning(grid, 'O')) {
            displayGrid(grid);
            System.out.println("\n  BOT WINS!");
            startGame();
            return true;
        }

        for (char[] row : grid) {
            for (char c : row) {
                if (c == ' ') return false;
            }
        }

        displayGrid(grid);
        System.out.println("\n DRAW!");
        startGame();
        return true;
    }

    // ================= DISPLAY =================
    private static void displayGrid(char[][] g) {
        System.out.println();
        // System.out.println("   1   2   3");
        for (int i = 0; i < 3; i++) {
            System.out.print( "  ");
            for (int j = 0; j < 3; j++) {
                System.out.print(g[i][j]);
                if (j < 2) System.out.print(" | ");
            }
            if (i < 2) System.out.println("\n  -----------");
        }
        System.out.println();
    }
}

