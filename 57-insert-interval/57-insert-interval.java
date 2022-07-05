class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int [] arr:intervals){
            list.add(arr);
        }
        list.add(newInterval);
        int[][] updated = list.toArray(new int[list.size()][2]);
        
        return mergeInterval(updated);
        
    }
    public int[][] mergeInterval(int[][] updated){
        Arrays.sort(updated,(a,b)->a[0]-b[0]);
         List<int[]> result = new ArrayList<>();
        
         int prev_start = updated[0][0];
         int prev_end = updated[0][1];
        
        
         for(int i=1;i<updated.length;i++){
             int [] curr = updated[i];
              
              if(curr[0]>prev_end){
                 
                  result.add(new int[]{prev_start,prev_end});
                  prev_start = curr[0];
                  prev_end = curr[1];
              }
            else if(curr[0]>=prev_start && curr[0]<=prev_end){
                
                 int [] merged = {prev_start,Math.max(prev_end,curr[1])};
               
                  prev_start = merged[0];
                  prev_end = merged[1];
                 
             }

            
         }
        result.add(new int[]{prev_start,prev_end});
        int [][] res = new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            res[i] = result.get(i);
        }
        
        return res;
    }
}