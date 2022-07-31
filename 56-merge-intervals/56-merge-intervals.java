class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int prevStart = intervals[0][0];
        int prevEnd = intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            int [] current = intervals[i];
            if(prevEnd<current[0]){
                result.add(new int[]{prevStart,prevEnd});
                prevStart= current[0];
                prevEnd = current[1];
            }
            else{
                prevStart = Math.min(prevStart,current[0]);
                prevEnd = Math.max(prevEnd,current[1]);
            }
        }
                result.add(new int[]{prevStart,prevEnd});
        
        return result.toArray(new int[result.size()][2]);
    }
}