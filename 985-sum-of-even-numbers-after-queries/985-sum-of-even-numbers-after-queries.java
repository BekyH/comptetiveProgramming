class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int initsum = 0;
        int [] ans = new int[queries.length];
        for(int num:nums){
            if(num%2==0){
                initsum = initsum + num;
            }
        }
        int index =  0;
        
        for(int[] query:queries){
            int val = query[0];
            int idx = query[1];
            int prevval = nums[idx];
            int new_val = prevval+val;
            nums[idx] = new_val;
            if(new_val%2!=0 && prevval%2==0){
                initsum = initsum-prevval;
                
            }
            else if(new_val%2==0 && prevval%2!=0){
                initsum = initsum + new_val;
            }
            else if(new_val%2==0 && prevval%2==0){
                initsum = initsum + val;
            }
            ans[index++] = initsum;
        }
        
        return ans;
    }
}