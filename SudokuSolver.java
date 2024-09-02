public class SudokuSolver {
    public static boolean solver(char[][] board, int r, int c) {
        int nr = 0;
        int nc = 0;
        if (c != board.length - 1) {
            nr = r;
            nc = c + 1;
        } else {
            nr = r + 1;
            nc = 0;
        }

        if (nr == board.length) {
            return true; // reached the end of the board, solution found
        }

        if (board[r][c] != '.') {
            if (solver(board, nr, nc)) {
                return true;
            }
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, r, c, i)) {
                    board[r][c] = (char) (i + '0');
                    if (solver(board, nr, nc)) {
                        return true;
                    } else {
                        board[r][c] = '.'; // backtrack
                    }
                }
            }
        }
        return false;
    }

    public static boolean isSafe(char[][] board, int r, int c, int i2) {
        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == (char) (i2 + '0') && i != c) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (board[i][c] == (char) (i2 + '0') && i != r) {
                return false;
            }
        }
        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == (char) (i2 + '0') && (i != r || j != c)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("- - - - - - - - - - - -");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print(" | ");
                }
                if (j == 8) {
                    System.out.println(board[i][j]);
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solver(board, 0, 0)) {
            printBoard(board);
        } else {
            System.out.println("No solution found");
        }
    }
}