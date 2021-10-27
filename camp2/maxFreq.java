import java.util.*;
public class maxFreq {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int prefix_sum = nums[0];
        int max_freq = 1;
        int left_ptr = 0;
        
        for(int i=1;i<nums.length;i++){
            int expected_sum = nums[i] * (i-left_ptr+1);
            prefix_sum = prefix_sum + nums[i];
            while(expected_sum-prefix_sum>k){
                prefix_sum =prefix_sum - nums[left_ptr];
                left_ptr++;
                expected_sum = nums[i] * (i-left_ptr+1);
            }
            max_freq = Math.max(i-left_ptr+1,max_freq);
        }
        
        return max_freq;
    }

}
