public class containerWithMostWater {
    //O(n) time and O(1) space solution
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int w = 0;
        int h = 0;
        int area = 0;
        int max_area = 0;
        while(left<right){
            w = right-left;
            h = Math.min(height[right],height[left]);
            area = h * w;
            max_area = Math.max(max_area,area);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
    //O(n^2) time and O(1) space solution
//    public int maxArea(int[] height) {
//        int max_area = 0;
//        int n = height.length;
//        int w = 0;
//        int h = 0;
//        int area = 0;
//        for(int i = 0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                w = j-i;
//                h=  Math.min(height[i],height[j]);
//                area = w * h;
//                max_area = Math.max(max_area,area);
//            }
//        }
//        return max_area;
//    }
}

