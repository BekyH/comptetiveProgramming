import java.util.Arrays;

public class FindingMedian {
    public static void main(String[] args){
        int [] arr = {0,1,2,4,6,5,3};
        median(arr);
    }


    public static void median(int[] arr){
        Arrays.sort(arr);
        int n = arr.length/2;
        int med =  n;
        System.out.println(arr[med]);

    }

}
