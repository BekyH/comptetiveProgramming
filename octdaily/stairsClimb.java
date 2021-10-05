import java.util.*;
public class stairsClimb{
    public int climbStairs(int n) {
        HashMap<Integer,Integer> memo = new HashMap<>();
        
           return climbingStairs(n,memo);  
    }
    public int climbingStairs(int n,HashMap<Integer,Integer> memo){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        
        memo.put(n,climbingStairs(n-1,memo) + climbingStairs(n-2,memo));
        return memo.get(n);
    }

}