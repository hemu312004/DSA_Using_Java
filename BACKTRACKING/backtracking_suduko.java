class BacktrackingSudoku {

    // Method to check if placing a number in a given cell is safe according to Sudoku rules
    public boolean isSafe(char[][] board, int row, int col, int number) {
        // Check the column for the same number
        for(int i = 0; i < board.length; i++) {
            if(board[i][col] == (char)(number + '0')) {
                return false;
            }
        }

        // Check the row for the same number
        for(int j = 0; j < board.length; j++) {
            if(board[row][j] == (char)(number + '0')) {
                return false;
            }
        }

        // Check the 3x3 grid for the same number
        int sr = 3 * (row / 3);  // starting row of the 3x3 grid
        int sc = 3 * (col / 3);  // starting column of the 3x3 grid

        for(int i = sr; i < sr + 3; i++) {
            for(int j = sc; j < sc + 3; j++) {
                if(board[i][j] == (char)(number + '0')) {
                    return false;
                }
            }
        }

        return true;  // It's safe to place the number in this cell
    }

    // Helper method to solve the Sudoku using backtracking
    public boolean helper(char[][] board, int row, int col) {
        // If we've reached the end of the board, the Sudoku is solved
        if(row == board.length) {
            return true;
        }

        int nrow, ncol;
        
        // Move to the next row if we are at the end of the current row
        if(col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        // If the current cell is already filled, move to the next cell
        if(board[row][col] != '.') {
            if(helper(board, nrow, ncol)) {
                return true;
            }
        } else {
            // Try placing each number from 1 to 9 in the current cell
            for(int i = 1; i <= 9; i++) {
                if(isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i + '0');  // Place the number

                    // Recursively try to solve the rest of the board
                    if(helper(board, nrow, ncol)) {
                        return true;
                    } else {
                        // Backtrack if placing the number didn't lead to a solution
                        board[row][col] = '.';
                    }
                }
            }
        }

        return false;  // No solution found for this configuration
    }

    // Main method to solve the Sudoku puzzle
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);  // Start solving from the top-left corner of the board
    }
}