class SnapshotArray {
  HashMap<Integer,Integer> [] arr;
    int counter;
    public SnapshotArray(int length) {
        arr = new HashMap[length];
        for(int i=0;i<length;i++){
            arr[i] = new HashMap<>();
        }
        counter = 0;
    }
    
    public void set(int index, int val) {
        arr[index].put(counter,val);
        
    }
    
    public int snap() {
        int temp = counter;
        counter++;
        return temp;
    }
    
    public int get(int index, int snap_id) {
        HashMap<Integer,Integer> map = arr[index];
       while(snap_id>=0){
           if(map.containsKey(snap_id)){
               return map.get(snap_id);
           }
           else{
               snap_id--;
           }
       }
        
        return 0;
    
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */