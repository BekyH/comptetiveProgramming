class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);
        List<int[]> result = new ArrayList<>();
        
         int prev_start = intervals[0][0];
         int prev_end = intervals[0][1];
        // int [] curr1 = intervals[1];
        
         for(int i=1;i<intervals.length;i++){
             int [] curr = intervals[i];
              
              if(curr[0]>prev_end){
                 // System.out.println(prev[0] + ":" + prev[1]);
                  result.add(new int[]{prev_start,prev_end});
                  prev_start = curr[0];
                  prev_end = curr[1];
              }
            else if(curr[0]>=prev_start && curr[0]<=prev_end){
                
                 int [] merged = {prev_start,Math.max(prev_end,curr[1])};
                //  result.add(merged);
                  prev_start = merged[0];
                  prev_end = merged[1];
                 
             }
//              else{
//                  result.add(prev);
//                  prev[0] = curr[0];
//                  prev[1] = curr[1];
//              }
            
         }
        result.add(new int[]{prev_start,prev_end});
        int [][] res = new int[result.size()][2];
        for(int i=0;i<result.size();i++){
            res[i] = result.get(i);
        }
        
        return res;
    }
}