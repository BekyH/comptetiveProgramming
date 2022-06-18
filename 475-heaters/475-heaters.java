class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int res = Integer.MIN_VALUE;
        Arrays.sort(heaters);
        int ans = 0;
        for(int i=0;i<houses.length;i++){
            int house = houses[i];
            int min = first_minimum(heaters,house);
            int max = first_maximum(heaters,house);
             int c1 = Math.abs(house-min);
            int c2 = Math.abs(house-max);
            int curr = Math.min(c1,c2);
            res = Math.max(curr,res);
        }
        // for(int x:radius){
        //    ans = Math.max(ans,x);
        // }
        
        return res;
        
    }
    
    public int first_minimum(int[] heaters,int target){
        int left = 0;
        int right = heaters.length-1;
        int ans = heaters[0];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(heaters[mid]<=target){
                ans = heaters[mid];
                left = mid+1;
            }
            else{
                right = mid-1;
            }
            
            
        }
        return ans;
    }
    public int first_maximum(int [] heaters,int target){
        int left = 0;
        int right = heaters.length-1;
        int ans = heaters[0];
        while(left<=right){
            int mid = left + (right-left)/2;
            if(heaters[mid]>=target){
                ans = heaters[mid];
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
}