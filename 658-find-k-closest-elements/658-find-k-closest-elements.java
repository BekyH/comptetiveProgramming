class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<elemt> min_heap = new PriorityQueue<>();
        List<Integer> lst = new ArrayList<>();
        for(int num:arr){
            elemt e = new elemt(num,Math.abs(num-x));
            min_heap.add(e);
        }
        int i=0;
        while(!min_heap.isEmpty() && i<k){
            lst.add(min_heap.poll().val);
            i++;
        }
        
        Collections.sort(lst);
        return lst;
        
    }
}

class elemt implements Comparable<elemt>{
    int val;
    int dist;
    elemt(int val,int dist){
        this.val = val;
        this.dist = dist;
        
    }
    @Override
    public int compareTo(elemt elmt) {
        if(dist==elmt.dist){
            return val-elmt.val;
        }
       return dist- elmt.dist;
    }
    
}