class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                helper(i,arr);
                if(i+1<arr.length){
                    arr[i+1] = 0;
                    i++;
                }
            }
        }
    }
    public void helper(int i,int [] arr){
        for(int j=arr.length-2;j>i;j--){
            arr[j+1] = arr[j];
        }
    }
}