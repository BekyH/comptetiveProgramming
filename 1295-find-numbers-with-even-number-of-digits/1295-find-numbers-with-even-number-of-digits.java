class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0;
        for(int num:nums){
            int n = countDigits(num);
            if(n%2==0){
                counter++;
            }
        }
        
        return counter;
    }
    
    public int countDigits(int n){
        int counter=0;
        while(n>0){
            n = n/10;
            counter++;
        }
        
        return counter;
    }
}