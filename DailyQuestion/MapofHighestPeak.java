import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;

public class MapofHighestPeak{

    public int[][] highestPeak(int[][] isWater) {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        HashSet<String> visited = new HashSet<>();
        int m = isWater.length;
        int n = isWater[0].length;
        Deque<land> deque = new ArrayDeque<>();
        for(int i = 0;i<m;i++){
            for(int j =0;j<n;j++){
                if(isWater[i][j]==1){
                    isWater[i][j]=0;
                    land l = new land(i,j,0);
                    deque.add(l);
                    visited.add(i + "," + j);
                }
            }

        }

        while(!deque.isEmpty()){
            land l = deque.pop();
            int row = l.row;
            int col = l.col;
            int h = l.height;

            for(int[] direction:directions){
                int newrow = row + direction[0];
                int newcol = col + direction[1];

                if(newrow>=0 && newrow<m && newcol>=0 && newcol<n &&
                        !visited.contains(newrow + "," + newcol) ){
                    int newheight = h +1;
                    land newland = new land(newrow,newcol,newheight);
                    isWater[newrow][newcol] = newheight;
                    deque.add(newland);
                    visited.add(newrow + "," + newcol);
                }
            }
        }
        return isWater;
    }
}

class land{
    int row;
    int col;
    int height;
    public land(int row,int col,int height){
        this.row = row;
        this.col = col;
        this.height = height;
    }

}