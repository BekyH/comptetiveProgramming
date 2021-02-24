import java.util.ArrayDeque;
import java.util.Deque;

public class rottingOranges {
    public int orangesRotting(int[][] grid) {
        int total_min=0;
        int freshCounter=0;
        int [] dx = {-1,0,1,0};
        int [] dy = {0,1,0,-1};
        int m = grid.length;
        int n = grid[0].length;
        Deque<orange> deque = new ArrayDeque<>();

        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2){
                    orange rottenOrange = new orange(i,j,0);
                    deque.add(rottenOrange);

                }
                else if(grid[i][j]==1){
                    freshCounter++;
                }
                else{
                }
            }
        }

        while(!deque.isEmpty()){
            int size = deque.size();
            for(int k = 0;k<size;k++){
                orange popedOrange = deque.poll();
                int row = popedOrange.row;
                int col = popedOrange.col;
                int min = popedOrange.minutes;
                total_min = Math.max(total_min,min);
                for(int i=0;i<4;i++){
                    int newrow = row + dx[i];
                    int newcol = col + dy[i];
                    if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && grid[newrow][newcol]==1){
                        freshCounter--;
                        grid[newrow][newcol]=2;
                        orange newrotten = new orange(newrow,newcol,min+1);
                        deque.add(newrotten);

                    }
                }

            }
        }

        if(freshCounter!=0){
            return -1;
        }
        return total_min;
    }

}

class orange{
    int row;
    int col;
    int minutes;
    public orange(int row,int col,int minutes){
        this.row =row;
        this.col = col;
        this.minutes = minutes;
    }

}

