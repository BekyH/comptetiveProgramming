class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max_area = Integer.MIN_VALUE;
        while(left<right){
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            int curr_area = h*w;
            max_area = Math.max(curr_area,max_area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        
        return max_area;
    }
}