class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
         int left = 0;
        int right = n-1;
        int up = 0;
        int down = m-1;
        int nm =m*n;
        //System.out.println(nm);
        List<Integer> result = new ArrayList<>();
         while(result.size()<(nm)){
             
             rightDir(matrix,left,right,up,result);
             //System.out.println(result);
            up++;
             if(result.size()<nm){
                 downDir(matrix,up,down,right,result);
             //System.out.println(result);
            right--;

             }
             if(result.size()<nm){
                   leftDir(matrix,left,right,down,result);
             //System.out.println(result);
            down--;
             }
             if(result.size()<nm){
                 upDir(matrix,up,down,left,result);
            //System.out.println(result);
            left++;
             }
                         
            
            
            
        }
        
        
        return result;
    }
     public void rightDir(int [][] matrix,int left,int right,int row,List<Integer> lst){
        for(int i=left;i<=right;i++){
            lst.add(matrix[row][i]);
        }
     //  System.out.println(lst);
    
    }
    
    public void leftDir(int [][] matrix,int left,int right,int row,List<Integer> lst){
        for(int i=right;i>=left;i--){
            lst.add(matrix[row][i]);
        }
        
        
    }
    
    public void downDir(int [][] matrix,int up,int down,int col,List<Integer> lst){
        for(int i=up;i<=down;i++){
            lst.add(matrix[i][col]);
        }
        
        
    }
    
    public void upDir(int[][] matrix, int up,int down,int col,List<Integer> lst){
        for(int i=down;i>=up;i--){
            lst.add(matrix[i][col]); 
        }
        
        
    }
}