import java.util.*;
public class foursum{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right =0;
        int sum = 0;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                left = j+1;
                right = n-1;
                while(left<right){
                    sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                        
                    }
                    else if(sum>target){
                        right--;
                    }
                    else{
                        left++;
                    }
                }
                
                
            }
        }
        return new ArrayList<>(set);
    }
}
