import java.util.*;
public class kthminsortedmatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                min_heap.add(matrix[i][j]);
                }
        }
        int i=1;
        int kthmin = 0;
        while(i<=k && !min_heap.isEmpty()){
             kthmin = min_heap.poll();
             i++;
        }
        return kthmin;
    }
}

