public class kclosest{
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<closest> min_heap = new PriorityQueue<>();
        for(int i:arr){
            int diff = Math.abs(i-x);
            closest c = new closest(i,diff);
            min_heap.add(c);
        }
        int j=1;
        while(j<=k && !min_heap.isEmpty()){
            closest cl = min_heap.poll();
            list.add(cl.num);
            j++;
        }
        Collections.sort(list);
        return list;
    }
}

class closest implements Comparable<closest>{
    int diff;
    int num;
    public closest(int num,int diff){
        this.num = num;
        this.diff = diff;
    }   
     @Override
    public int compareTo(closest c) {
       if(diff==c.diff){
           return num-c.num;
       }
        return diff - c.diff;
    }
}
