public class FirstBadVersion{
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int first_bad = 0;
        
        while(left<=right){
             int mid = left + (right-left)/2;
             if(isBadVersion(mid)){
                 first_bad = mid;
                 right = mid-1;
             }
             else{
                left = mid+1;
            }
        }
        return first_bad;
    }
}
