import java.util.Arrays;
import java.util.HashSet;

public class pair {
    static int pairs(int k, int[] arr) {
        int counter = 0;
        HashSet<Integer> hashset = new HashSet<>();
        for(int x:arr){
            hashset.add(x);
        }
        for(int y:arr){
            int sum = y +k;
            if(hashset.contains(sum)){
                counter++;
            }
        }
        return counter;

    }
//    static int pairs(int k, int[] arr) {
//        int counter = 0;
//        int[] newarr = new int[arr.length];
//        for(int i = 0;i<arr.length;i++){
//            newarr[i] = arr[i] + k;
//
//        }
//        Arrays.sort(arr);
//
//        for(int j=0;j<newarr.length;j++){
//            int isFound = Arrays.binarySearch(arr,newarr[j]);
//            if(isFound>=0){
//                counter++;
//            }
//        }
//        return counter;
//
//    }

}
