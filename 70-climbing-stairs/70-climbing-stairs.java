class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        return helper(n,memo);
    }
    public int helper(int n,HashMap<Integer,Integer> memo){
        if(n<3){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        memo.put(n,helper(n-2,memo) + helper(n-1,memo));
        return memo.get(n);
    }
}