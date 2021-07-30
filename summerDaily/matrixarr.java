import java.util.*;
public class matrixarr {
   
        public int[][] updateMatrix(int[][] mat) {
          
            Deque<matrix> deque = new ArrayDeque<>();
            int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[0].length;j++){
                    if(mat[i][j]==0){
                        deque.add(new matrix(i,j));
                    }
                    else{
                        mat[i][j]=-1;
                    }
                }
            }
            while(!deque.isEmpty()){
                matrix mt = deque.poll();
                int row = mt.i;
                int col = mt.j;
                for(int[] direction:directions){
                    int new_row = row + direction[0];
                    int new_col = col + direction[1];
                    if(new_row>=0 && new_row<mat.length && new_col>=0 && new_col<mat[0].length && mat[new_row][new_col]==-1 ){
                        mat[new_row][new_col] = mat[row][col] +1;
                         deque.add(new matrix(new_row,new_col));
                    }
                }
            }
            
            return mat;
            
        }
        
        
    }
    class matrix{
        int i;
        int j;
        public matrix(int i,int j){
            this.i = i;
            this.j = j;
        }
    }

