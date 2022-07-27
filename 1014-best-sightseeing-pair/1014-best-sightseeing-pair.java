class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        //values[i]+i + valus[j]-j
        int result = Integer.MIN_VALUE;
        int maxi = values[0];
        for(int j=1;j<values.length;j++){
            result = Math.max(result,maxi+values[j]-j);
            maxi = Math.max(maxi,values[j]+j);
        }
        
        return result;
    }
}