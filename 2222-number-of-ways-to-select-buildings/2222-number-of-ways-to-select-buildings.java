class Solution {
    public long numberOfWays(String s) {
        long num_zero = 0;
        long num_one = 0;
        long curr_one = 0;
        long curr_zero = 0;
        long total_ways = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='0'){
                num_zero++;
                curr_zero = curr_zero + num_one;
                total_ways = total_ways + curr_one;
            }
            else{
                num_one++;
                curr_one  = curr_one +num_zero;
                total_ways = total_ways + curr_zero;
            }
        }
        
        return total_ways;
    }
}