class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
            long x1 = Math.max(rec1[0],rec2[0]);
            long y1 = Math.max(rec1[1],rec2[1]);
            long x2 = Math.min(rec1[2],rec2[2]);
            long y2 = Math.min(rec1[3],rec2[3]);
        
        long a = area(x1,x2,y1,y2);
        return a>0;
    }
    public long area(long x1,long x2, long y1,long y2){
        if((x2-x1<0) || (y2-y1)<0){
            return 0;
        }
        
        return (x2-x1) * (y2-y1);
    }
}