import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class salesByMatch {

    public static void main(String [] args){
        int [] arr  = {1,2,1,2,1,3,2};
        int [] arr2 = {10,20,20,10,10,30,50,10,20};
        int [] arr3 = {1,1,3,1,2,1,3,3,3,3};
       checkPair(arr,5);
       checkPair(arr2,9);
        checkPair(arr3,10);


    }
    public static void checkPair(int[] arr,int n){
        if(n<=1){
            return;
        }
        int counter = 1;

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(hashMap.containsKey(arr[i])){
                int g =hashMap.get(arr[i]).intValue();
                g++;
                hashMap.put(arr[i],g);
            }
            else{
                counter=1;
                hashMap.put(arr[i],counter);
            }
        }
        int pairs = 0;
        for(Map.Entry<Integer,Integer> x:hashMap.entrySet()){
                pairs = pairs + x.getValue()/2;
        }


        System.out.println(pairs);

    }
}
