import java.lang.reflect.Array;
import java.util.*;

public class relativeSort {

    public static void main(String[] args){
        int [] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int [] arr2 = {2,1,4,3,9,6};
        relativeSortArray(arr1,arr2);

    }
    public static void relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> relativelySorted = new ArrayList<>();
        List<Integer> listarr1 = new ArrayList<>();
        boolean isFound = false;
        for(int k = 0;k<arr1.length;k++){
            isFound = false;
            for(int m = 0;m<arr2.length;m++){
                if(arr1[k]==arr2[m]){
                    isFound = true;
                    break;
                }
            }
            if(!isFound){
                listarr1.add(arr1[k]);
            }
        }






        for(int i = 0;i<arr2.length;i++) {

            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {

                    relativelySorted.add(arr1[j]);



                }




            }


        }






            for(int y:listarr1){
                relativelySorted.add(y);
            }



        for(int x:relativelySorted){
            System.out.print(x + " ");
        }


    }
}
