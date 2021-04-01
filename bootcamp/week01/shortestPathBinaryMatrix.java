package com.company;

import java.util.ArrayDeque;
import java.util.Deque;

public class shortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int min_path = Integer.MAX_VALUE;
        Deque<Path> deque = new ArrayDeque<>();

        int m = grid.length;
        int n = grid[0].length;
        int [][] directions = {{0,1},{0,-1},{-1,0},{1,0},{1,1},{1,-1},{-1,-1},{-1,1}};
        if(grid[0][0]==1 || grid[m-1][n-1]==1){
            return -1;
        }


        Path path = new Path(0,0,1);
        deque.add(path);
        grid[0][0]=1;

        int res =  bfs(grid,deque,directions,m,n,min_path);
        if (res != Integer.MAX_VALUE){
            return res;
        }
        return -1;

    }

    public int bfs(int[][] grid,Deque<Path> deque,int[][] directions,int m,int n,int min_path){
        while(!deque.isEmpty()){
            Path parentPath = deque.poll();
            int row = parentPath.row;
            int col = parentPath.col;
            int dist = parentPath.dist;
            if(row == (m-1) && col == (n-1)){
                min_path = Math.min(min_path,dist);
            }

            for(int[] direction:directions){
                int new_row = row + direction[0];
                int new_col = col + direction[1];
                if(new_row<m && new_row>=0 && new_col<n && new_col>=0 && grid[new_row][new_col]==0){

                    grid[new_row][new_col]=1;
                    Path childPath = new Path(new_row,new_col,dist+1);
                    deque.add(childPath);

                }
            }
        }

        return min_path;
    }


}
class Path{
    int row;
    int col;
    int dist;
    public Path(int row,int col,int dist){
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}
