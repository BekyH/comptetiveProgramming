public class maxLengthRepeatedSubarray {
    public int findLength(int[] nums1, int[] nums2) {
        int n = Math.max(nums1.length,nums2.length);
        int [][] arr = new int[n][n];
        int max_len = Integer.MIN_VALUE;
        int[] dir ={-1,-1};
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int new_row = i+dir[0];
                    int new_col= j+dir[1];
                    if(new_row>=0 && new_row<=n && new_col>=0 && new_col<n && arr[new_row][new_col]!=0){
                            arr[i][j]= 1 + arr[new_row][new_col];
                    }
                    else{
                        arr[i][j]=1;
                    }
                }
                else{
                    arr[i][j]=0;
                }
                max_len = Math.max(arr[i][j],max_len);
            }
        }
           
        return max_len;
    }
}
