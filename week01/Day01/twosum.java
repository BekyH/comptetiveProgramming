import java.util.Arrays;

public class twosum {
    boolean isfound;
    public int[]  twoSu(int[]arr, int target){

        int[] results=new int[2];
         isfound=false;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    results[0]=i;
                    results[1]=j;
                    isfound = true;
                    return results;
                }

            }
        }

        return results;

    }



}
