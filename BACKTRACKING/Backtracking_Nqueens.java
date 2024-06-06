import java.util.ArrayList;
import java.util.List;

public class Backtracking_Nqueens {

    // Method to check if placing a queen at (row, col) is safe
    public boolean isSafe(int row, int col, char[][] board) {
        // Check the row on the left
        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check the lower left diagonal
        for (int i = row, j = col; i < board.length && j >= 0; i++, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // If no conflicts, return true
        return true;
    }

    // Method to save the current board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // Helper method to solve the N-Queens problem
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards); // Save the board if a solution is found
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) { // Check if placing a queen is safe
                board[row][col] = 'Q'; // Place the queen
                helper(board, allBoards, col + 1); // Recur to place the rest
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Main method to solve the N-Queens problem and return all solutions
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with empty cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0); // Start the backtracking process
        return allBoards; // Return all found solutions
    }

    public static void main(String[] args) {
        Backtracking_Nqueens solver = new Backtracking_Nqueens();
        int n = 4; // Example for a 4x4 board
        List<List<String>> solutions = solver.solveNQueens(n);

        // Print all solutions
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
 