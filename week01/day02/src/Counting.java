import java.util.ArrayList;

public class Counting {

    public static void countingSort(int [] arr) {
        int n = arr.length;

        ArrayList<Integer> arrayList = new ArrayList<>();
        int max = 0;

        int x = max + 1;
        if(x<n){
            int diff = n-x;
            x=x+diff;
        }

        int[] sortres = new int[x];
        for (int j = 0; j < x; j++) {
            int temp = arr[j];

            if(sortres[temp]>0){
                sortres[temp]++;
            }
            else{
                sortres[temp] = 1;
            }




        }

        for (int a : sortres) {
            System.out.print(a + " ");

        }
        for(int f=0;f<sortres.length;f++){
           int ff = sortres[f];
           while (ff>0){
               arrayList.add(f);
               ff--;
           }
        }
        System.out.println();
        for(int e:arrayList){
            System.out.print(e + " ");

        }

    }

    public static void main(String [] args){
        int[] arr = {2,2,3,1,0,5,3,3,4,6,10,1,0,10,3};
        countingSort(arr);
    }

}
