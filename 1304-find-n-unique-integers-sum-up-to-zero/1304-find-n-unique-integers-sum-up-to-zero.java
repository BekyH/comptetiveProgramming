class Solution {
    public int[] sumZero(int n) {
        int [] result = new int[n];
        int index = 0;
        int start = 0;
        int counter = 0;
        if(n%2==0){
            start = 1;
            
        }
        if(n%2!=0){
            result[index++] = 0;
            start++;
            counter = 1;
        }
        
        while(counter<n){
            result[index++] = -1 * start;
            result[index++] = start;
            start++;
            counter = counter+2;
        }
        
        return result;
    }
}