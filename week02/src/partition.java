import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Scanner;

public class partition {
    public static void main(String[] args){
        int [] arr = {5,8,1,3,7,9,2};
        quickSort(arr);



    }


    static void quickSort(int[] arr) {

        ArrayList<Integer> leftlist = new ArrayList<>();
        ArrayList<Integer> rightlist = new ArrayList<>();
        int[] equalarr = new int[1];

        equalarr[0] = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>equalarr[0]){
                rightlist.add(arr[i]);
            }
            else if(arr[i]<equalarr[0]){
                leftlist.add(arr[i]);
            }
        }
        int j = 0;
        int[] leftarr = new int[leftlist.size()];
        int[] rightarr = new int[rightlist.size()];

        for(int i = 0;i<leftarr.length;i++){
            leftarr[i] = leftlist.get(i);
        }
        if(leftarr.length>1){
            quickSort(leftarr);

        }
        for(int a=0;a<rightarr.length;a++){
            rightarr[a]=rightlist.get(a);
        }
        if(rightarr.length>1){
            quickSort(rightarr);
        }
        ArrayList<Integer> ss = new ArrayList<>();
        for(int x:leftarr){
            ss.add(x);
        }

        for(int z:equalarr){
            ss.add(z);
        }
        for(int  y:rightarr){
            ss.add(y);
        }
        for(int i = 0;i<ss.size();i++) {
            arr[i] = ss.get(i);
        }


        for(int k:arr){
            System.out.print(k + " ");
        }
        System.out.println();

    }
}
