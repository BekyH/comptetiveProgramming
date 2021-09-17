package comptetiveProgramming.septDaily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class intersectionArrayII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i:nums1){
            if(hashmap.containsKey(i)){
                int val = hashmap.get(i);
                val = val + 1;
                hashmap.put(i,val);
            }
            else{
                hashmap.put(i,1);
            }
        }
        for(int j:nums2){
            if(hashmap.containsKey(j) && hashmap.get(j)>0){
                list.add(j);
                int val = hashmap.get(j)-1;
                hashmap.put(j,val);
            }
        }

        int [] res = new int[list.size()];
        int index=0;
        for(int x:list){
            res[index++]=x;
        }
        return res;
    }
}
