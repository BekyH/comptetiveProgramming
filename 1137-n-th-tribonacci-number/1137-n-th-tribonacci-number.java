class Solution {
    public int tribonacci(int n) {
       HashMap<Integer,Integer> memo = new HashMap<>();
        return tribo(n,memo);
    }
    public int tribo(int n,HashMap<Integer,Integer> memo){
        if(n<2){
            return n ;
        }
        if(n==2){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        
        memo.put(n,tribo(n-3,memo) + tribo(n-2,memo) + tribo(n-1,memo));
        return memo.get(n);
    }
}