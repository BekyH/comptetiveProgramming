public class minesWeeper {
    public char[][] updateBoard(char[][] board, int[] click) {
        if (board[click[0]][click[1]] == 'M') {
            board[click[0]][click[1]] = 'X';
            return board;
        }
        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };
        int m = board.length;
        int n = board[0].length;
        minesweeper(board, directions, click[0], click[1], m, n);
        return board;

    }

    public void minesweeper(char[][] board, int[][] directions, int row, int col, int m, int n) {

        int num_mines = count(board, row, col, directions, m, n);
        if (num_mines > 0) {
            char c = (char) ('0' + num_mines);
            board[row][col] = c;
        } else {
            board[row][col] = 'B';
        }
        for (int[] direction : directions) {
            int new_row = row + direction[0];
            int new_col = col + direction[1];
            if (new_row >= 0 && new_row < m && new_col >= 0 && new_col < n) {
                if (board[new_row][new_col] == 'E' && board[row][col] == 'B') {
                    minesweeper(board, directions, new_row, new_col, m, n);
                }
            }
        }

    }

    public int count(char[][] board, int row, int col, int[][] directions, int m, int n) {
        int counter = 0;
        for (int[] direction : directions) {
            int new_row = row + direction[0];
            int new_col = col + direction[1];
            if (new_row >= 0 && new_row < m && new_col >= 0 && new_col < n) {
                if (board[new_row][new_col] == 'M') {
                    counter++;
                }
            }
        }
        return counter;
    }
}
