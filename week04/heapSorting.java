import java.util.ArrayList;
import java.util.PriorityQueue;

public class heapSorting {
    public static void main(String[] args){
        int[] arr = {5,3,4,2,1,7,8,5,9,0,1};
        heapSort(arr);
    }

    public static void heapSort(int[] arr){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int x:arr){
            heap.add(x);


        }
        while(heap.size()>0){
            arrayList.add(heap.poll());
        }



    }

}
