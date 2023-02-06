class Solution {
    public int racecar(int target) {
        Deque<int[]> deque = new ArrayDeque<>();
        int [] inital  = {1,0,0};
        deque.add(inital);
        while(!deque.isEmpty()){
             int [] curr = deque.poll();
            int sp = curr[0];
            int pos = curr[1];
            int len = curr[2];
            if(pos==target){
                return len;
            }
            
            deque.add(new int[]{sp*2,pos+sp,len+1});
            if(((pos+sp)>target && sp>0) || ((pos+sp)< target && sp<0)){
                if(sp>0){
                    sp = -1;
                }
                else{
                    sp = 1;
                }
                deque.add(new int[]{sp,pos,len+1});
             
            }
          
            
        }
        
        return -1;
    }
}