import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println(" **** GAME START **** \n");

        int rows = 3, columns = rows;
        char[][] grid = createGrid(rows, columns);

        for (char[] arr : grid) {
            Arrays.fill(arr, ' ');
        }

        boolean o= false;

        while (true) {

            if (!o) {
                boolean x = player(grid, 'X');
                if (!x)
                    continue;
            }

            checkWinner(grid);

            o= player(grid, 'O');
            if (!o) {
                o = true;
                continue;
            }

            checkWinner(grid);
            o=false;
        }
    }

    private static void checkWinner(char[][] grid) {
        int x = 0, o = 0;

        // Horizontally
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (grid[i][j] == 'X') x++;
                else if (grid[i][j] == 'O') o++;
            }
            if (x == 3) {
                displayGrid(grid);
                System.out.println("\n X is winner \n");
                startGame();
            } else if (o == 3) {
                displayGrid(grid);
                System.out.println("\n O is winner \n");
                startGame();
            }
            x = 0;
            o = 0;
        }

        // Vertically

        x=0;
        o=0;
        for (int j = 0; j <= 2; j++) {
            for (int i = 0; i <= 2; i++) {
                if (grid[i][j] == 'X') x++;
                else if (grid[i][j] == 'O') o++;
            }
            if (x == 3) {
                displayGrid(grid);
                System.out.println("\n X is winner \n");
                startGame();
            } else if (o == 3) {
                displayGrid(grid);
                System.out.println("\n O is winner \n");
                startGame();
            }
            x = 0;
            o = 0;
        }

        // Diagonal
        if ((grid[0][0] == 'X' && grid[1][1] == 'X' && grid[2][2] == 'X')
                || (grid[0][2] == 'X' && grid[1][1] == 'X' && grid[2][0] == 'X')) {
            displayGrid(grid);
            System.out.println("\n X is winner \n");
            startGame();
        } else if ((grid[0][0] == 'O' && grid[1][1] == 'O' && grid[2][2] == 'O')
                || (grid[0][2] == 'O' && grid[1][1] == 'O' && grid[2][0] == 'O')) {
            displayGrid(grid);
            System.out.println("\n O is winner \n");
            startGame();
        }

        // Draw
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                if (grid[i][j] == ' ')
                    return;
            }
        }

        System.out.println("\n DRAW \n");
        startGame();
    }

    private static boolean player(char[][] grid, char playerName) {
        displayGrid(grid);
        System.out.print("\nEnter your response " + playerName + " : ");
        String resp = new Scanner(System.in).next().toUpperCase();
        return checkResponse(grid, playerName, resp);
    }

    private static boolean checkResponse(char[][] grid, char playerName, String resp) {
        int i = resp.charAt(0) - 65;
        int j = resp.charAt(1) - 49;

        if (i < 0 || i > 2 || j < 0 || j > 2) {
            System.out.println("\n INVALID RESPONSE \n");
            return false;
        }

        if (grid[i][j] == ' ')
            grid[i][j] = playerName;
        else {
            System.out.println("\n Response already submitted \n");
            return false;
        }

        return true;
    }

    public static void displayGrid(char[][] grid) {
        System.out.println();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.printf(" %s ", grid[i][j]);
                if (j < 2)
                    System.out.print("|");
            }
            if (i < 2)
                System.out.println("\n-----------");
        }
        System.out.println();
    }

    private static char[][] createGrid(int rows, int columns) {
         char[][] grid = new char[rows][columns];
        return grid;
    }
}
