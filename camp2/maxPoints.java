public class maxPoints {
    public int maxScore(int[] cardPoints, int k) {
        int prefix_sum=0;
        for(int i=0;i<k;i++){
            prefix_sum = prefix_sum + cardPoints[i];
        }
        int left_ptr = k-1;
        int right_ptr = cardPoints.length-1;
        int max_score = prefix_sum;
        for(int i=0;i<k;i++){
         prefix_sum = prefix_sum -cardPoints[left_ptr] + cardPoints[right_ptr];
        max_score = Math.max(max_score,prefix_sum);
        left_ptr--;
        right_ptr--;
        
    }
    return max_score;
    }
}
