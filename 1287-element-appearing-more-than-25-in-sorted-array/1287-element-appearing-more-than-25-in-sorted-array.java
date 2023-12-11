class Solution {
    public int findSpecialInteger(int[] arr) {
        int max = Integer.MIN_VALUE;
        int max_val=arr[0];
        int counter = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i]){
                counter++;
                if(counter>max){
                    max = counter;
                    max_val = arr[i-1];
                    
                }
            }
            else{
                
                counter=0;
            }
        }
        return max_val;
    }
}