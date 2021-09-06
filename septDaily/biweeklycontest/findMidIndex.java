package comptetiveProgramming.septDaily.biweeklycontest;

public class findMidIndex {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int [] prefixsum = new int[n];
        int midindex = -1;
        prefixsum[0] = nums[0];
        int [] suffixsum = new int[n];
        suffixsum[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            prefixsum[i] = prefixsum[i-1] + nums[i];

        }
        for(int i=n-2;i>=0;i--){
            suffixsum[i] = suffixsum[i+1] + nums[i];
        }
        int index=0;
        while(index<n){
            if(prefixsum[index]==suffixsum[index]){
                midindex=index;
                break;
            }
            index++;
        }
        return midindex;
    }
}
