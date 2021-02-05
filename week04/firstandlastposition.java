import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class firstandlastposition {
    public static void  main(String[] args){
        int[] arr = {1,2,3,4};

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        if (nums.length == 0) {
            arr[0] = -1;
            arr[1] = -1;
            return arr;

        }
       ArrayList<Integer> arrayList = new ArrayList<>();
        for(int x:nums){
            arrayList.add(x);

        }
        int x = arrayList.indexOf(target);
        int y = arrayList.lastIndexOf(target);
        arr[0]=x;
        arr[1] = y;



        return arr;


    }

}