import java.util.*;
public class allduplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int [] count = new int[n+1];
         for(int i=0;i<n;i++){
             count[nums[i]] = count[nums[i]] +1;;
         }
         for(int j=0;j<=n;j++){
             if(count[j]==2){
                 list.add(j);
             }
         }
         return list;
     }
 
}
