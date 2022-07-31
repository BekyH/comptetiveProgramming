class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> newIntervals = new ArrayList<>();
        List<int[]> result = new ArrayList<>();
        for(int[] interval:intervals){
        newIntervals.add(interval);
            
        }
        newIntervals.add(newInterval);
        
        int[][] newInter = newIntervals.toArray(new int[newIntervals.size()][2]);
        Arrays.sort(newInter,(a,b)->a[0]-b[0]);
        int prevStart = newInter[0][0];
        int prevEnd = newInter[0][1];
        
        for(int i=1;i<newInter.length;i++){
            int [] current = newInter[i];
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