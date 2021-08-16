import java.util.*;

public class setmatrixzero {
    
    public void setZeroes(int[][] matrix) {
        List<Pair<Integer,Integer>> list = new ArrayList<>();
       for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]==0){
                  
              
            Pair pair = new Pair(i,j);
                  list.add(pair);
                  }
          } 
       }
        for(Pair<Integer,Integer> pair:list){
           int row = pair.getKey();
            int col = pair.getValue();
            for(int i=row;i>=0;i--){
                matrix[i][col]=0;
            }
            for(int k=row;k<matrix.length;k++){
                matrix[k][col]=0;
            }
            for(int j=col;j>=0;j--){
                matrix[row][j]=0;
            }
            for(int c=col;c<matrix[0].length;c++){
              matrix[row][c]= 0;  
            }
        }
    }
}
