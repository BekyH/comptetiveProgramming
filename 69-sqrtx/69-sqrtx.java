class Solution {
    public int mySqrt(int x) {
        long ans = 0;
        long left = 0;
        long right = x;
        while(left<=right){
            long mid = left + (right-left)/2;
            long sq = mid * mid;
            if(sq==x){
                return (int)mid;
            }
            else if(sq<x){
                ans = mid;
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        
        return (int)ans;
    }
}