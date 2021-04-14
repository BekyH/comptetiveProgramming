//brute force
public class subRectanlgeQueries {
    int[][] rectangle;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                rectangle[i][j] = newValue;
            }
        }
    }

    public int getValue(int row, int col) {
        return rectangle[row][col];
    }

}

// optimial
class SubrectangleQueries {
    int[][] rectangle;
    List<List<Integer>> list;

    public SubrectangleQueries(int[][] rectangle) {
        this.rectangle = rectangle;
        this.list = new ArrayList<>();
    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(row1, col1, row2, col2, newValue));
        list.add(lst);
    }

    public int getValue(int row, int col) {
        for (int i = list.size() - 1; i >= 0; i--) {
            List<Integer> lst = list.get(i);
            int r1 = lst.get(0);
            int c1 = lst.get(1);
            int r2 = lst.get(2);
            int c2 = lst.get(3);
            int val = lst.get(4);
            if (r1 <= row && row <= r2 && c1 <= col && col <= c2) {
                return val;
            }
        }
        return rectangle[row][col];
    }
}