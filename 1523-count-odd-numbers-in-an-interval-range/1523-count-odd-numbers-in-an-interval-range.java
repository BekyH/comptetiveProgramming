class Solution {
    public int countOdds(int low, int high) {
        int diff = high-low +1;
        if(diff%2==0){
            return diff/2;
        }
        else{
            if(low%2!=0 || high%2!=0){
                return (diff/2)+1;
            }
            return (diff/2);
        }
    }
}