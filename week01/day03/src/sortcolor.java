public class sortcolor {
    public static void main(String[] args){
    int [] nums = {4,2,3,1,2};
    sortColors(nums);

    }
    public static void sortColors(int[] nums){
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]= nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int x:nums){
            System.out.print(x + " ");
        }

    }


}
