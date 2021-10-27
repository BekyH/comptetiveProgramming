import java.util.*;
public class wiggleSort {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] sorted = new int[nums.length];
        sorted  = nums.clone();
        int index = 1;
        int half = 0;
        if(n%2==0){
            half = n/2;
        }
        else{
            half = half+1;
        }
        
        int sorted_index= n-1;
        while(index <n && sorted_index>half-1){
            nums[index] = sorted[sorted_index];
            sorted_index--;
            index = index+2;
        }
         index=0;
        
        while(index<n && sorted_index>=0){
            nums[index] = sorted[sorted_index];
            sorted_index--;
            index = index+2;
        }

}
}