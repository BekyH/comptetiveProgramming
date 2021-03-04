import java.util.*;

public class topKfrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        PriorityQueue<element> minHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(nums[i])) {
                int x = hashmap.get(nums[i]).intValue();
                x = x + 1;
                hashmap.put(nums[i], x);
            } else {
                hashmap.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hashmap.entrySet()){
            element freqelement = new element(e.getKey(),e.getValue());

            minHeap.add(freqelement);

        }
        int[] res = new int[k];
        int i = 0;
        while(i<k){
            if(!minHeap.isEmpty()){
                element freq = minHeap.remove();

                res[i] = freq.key;
                i++;
            }


        }

        return res;


    }
}
class element implements Comparable<element>{
    int key;
    int frequency;
    public element(int key, int frequency){
        this.key = key;
        this.frequency = frequency;
    }
    @Override
    public int compareTo(element elmt) {

        return frequency - elmt.frequency;
    }


}

