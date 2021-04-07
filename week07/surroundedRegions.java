public class surrounded {
    public void solve(char[][] board) {
        Set<List<Integer>> invalids = new HashSet<>();
        Deque<List<Integer>> deque = new ArrayDeque<>();
        Set<List<Integer>> visited = new HashSet<>();
        int m = board.length;
        int n = board[0].length;

        int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && (board[i][j] == 'O')) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    invalids.add(list);
                }
            }
        }
        for (List<Integer> invalid : invalids) {
            deque.add(invalid);
        }
        while (!deque.isEmpty()) {
            List<Integer> position = deque.poll();
            visited.add(position);
            for (int[] direction : directions) {
                int new_row = position.get(0) + direction[0];
                int new_col = position.get(1) + direction[1];
                List<Integer> list = new ArrayList<>();
                list.add(new_row);
                list.add(new_col);
                if (0 <= new_row && new_row < m && 0 <= new_col && new_col < n && !visited.contains(list)
                        && board[new_row][new_col] == 'O') {
                    invalids.add(list);
                    deque.add(list);
                    visited.add(list);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') {
                    List<Integer> lst = new ArrayList<>();
                    lst.add(i);
                    lst.add(j);
                    if (!invalids.contains(lst)) {
                        board[i][j] = 'X';
                    }
                }

            }
        }
    }
}
