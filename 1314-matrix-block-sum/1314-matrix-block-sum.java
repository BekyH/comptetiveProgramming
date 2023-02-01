class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] prefixSum = new int[m][n];
        int[][] answer = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((i-1)<0 &&(j-1)<0){
                    prefixSum[i][j] = mat[i][j];
                }
                else if((j-1)<0){
                    prefixSum[i][j] = mat[i][j] + prefixSum[i-1][j];
                }
                else if((i-1)<0){
                    prefixSum[i][j] = mat[i][j] + prefixSum[i][j-1];
                }
                else{
                    prefixSum[i][j] = mat[i][j] + prefixSum[i-1][j] + prefixSum[i][j-1]                         -prefixSum[i-1][j-1];
                }
            }
        }
        int rowbottom,colbottom,rowupper,colupper = 0;
        int topleft=0,topright=0,bottomleft = 0;
        int total = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                topleft=0;topright=0;bottomleft = 0;
               rowbottom = Math.min(i+k,m-1);
               colbottom = Math.min(j+k,n-1);
               rowupper = Math.max(0,i-k);
               colupper = Math.max(0,j-k);
               
                if(isValid(rowupper-1,colupper-1,mat)){
                    topleft = prefixSum[rowupper-1][colupper-1];
                }
                if(isValid(rowupper-1,colbottom,mat)){
                    topright = prefixSum[rowupper-1][colbottom];
                }
                if(isValid(rowbottom,colupper-1,mat)){
                    bottomleft = prefixSum[rowbottom][colupper-1];
                }
                total = prefixSum[rowbottom][colbottom];
               // System.out.println(topleft + ":" + topright + ":" + bottomleft);
//                  System.out.println(i + ":" + j+ ":" + "rowbottom: " + rowbottom + "colupper: " + colupper +":" + total +":"+ "topLeft : " + topleft + ":" + "topright: " + topright + ":" + "bottomleft: "+bottomleft);
           mat[i][j] = total - topright-bottomleft + topleft;
                                
        }
        }
        return mat;
    }
    public boolean isValid(int i,int j,int[][] mat){
         if(i>=0 && j>=0 && i<mat.length && j<mat[0].length){
             return true;
         }
        return false;
    }
}