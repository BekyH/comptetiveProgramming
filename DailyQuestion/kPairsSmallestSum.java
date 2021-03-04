import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class kPairsSmallestSum {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1==0 || n2==0 || k==0){
            return result;
        }
        PriorityQueue<Pair> min_heap = new PriorityQueue<>();
        for(int i:nums1){
            for(int j:nums2){
                int sum = i+j;
                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j);
                Pair pair = new Pair(list,sum);
                min_heap.add(pair);
            }
        }
        for(int i=0;i<k;i++){
            if(!min_heap.isEmpty()){


                Pair p = min_heap.poll();
                List<Integer> ls = p.list;
                result.add(ls);
            }

        }
        return result;
    }
}

class Pair implements Comparable<Pair>{
    List<Integer> list;
    int sum;
    public Pair(List<Integer> list, int sum){
        this.list = list;
        this.sum = sum;
    }
    @Override
    public int compareTo(Pair pair) {

        return sum - pair.sum;
    }


}

