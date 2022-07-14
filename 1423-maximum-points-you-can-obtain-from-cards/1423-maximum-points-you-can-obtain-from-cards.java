class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int curr_sum = 0;
        
        for(int i=0;i<k;i++){
            curr_sum = curr_sum + cardPoints[i];
        }
        int max = curr_sum;
        int left = k-1;
        int right = cardPoints.length-1;
        for(int i=0;i<k;i++){
            curr_sum = curr_sum - cardPoints[left] + cardPoints[right];
            max = Math.max(max,curr_sum);
            left--;
            right--;
            
        }
        
        return max;
    }
    
}