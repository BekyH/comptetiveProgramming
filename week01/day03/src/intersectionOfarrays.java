import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class intersectionOfarrays {

    public static void main(String[] args){
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
        int [] result = intersection(nums1,nums2);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> res = new ArrayList<>();
                    for(int i = 0;i<nums1.length;i++){
                        for(int j = 0;j<nums2.length;j++){
                            if(nums1[i]==nums2[j]){
                               res.add(nums1[i]);
                            }
                        }
                    }

        HashMap<Integer,Integer>  hashMap = new HashMap<>();
                    for(int x:res){
                        hashMap.put(x,1);
                    }
        int[] arr = new int[hashMap.size()];
                    int m = 0;
                    for(Map.Entry<Integer,Integer> e:hashMap.entrySet()){
                        arr[m]= e.getKey();
                        m++;
                    }
                    for(int x:arr){
                        System.out.print(x + " ");
                    }
                    return arr;
    }
}
