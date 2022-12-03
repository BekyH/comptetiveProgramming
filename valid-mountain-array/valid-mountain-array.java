class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3){
            return false;
        }
        boolean decreasing = false;
        boolean increasing = false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1] && !decreasing ){
                increasing = true;
            }
            else if (arr[i]>arr[i+1] && increasing){
                
                decreasing = true;
            }
            else{
                return false;
            }
            
        } 
        
        return increasing && decreasing;
    }
}