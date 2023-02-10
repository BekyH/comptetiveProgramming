class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        double [] nums = new double[n+m];
        int left = 0;
        int right = 0;
        int index=0;
        while(left<n && right<m ){
            if(nums1[left]<nums2[right]){
                nums[index++] = (double)nums1[left];
                left++;
            }
            else{
                nums[index++] = (double)nums2[right];
                right++;
            }
        }
        while(left<n){
            nums[index++] = (double)nums1[left++];
        }
        while(right<m){
            nums[index++] = (double)nums2[right++];
        }
        int mid = nums.length/2;
        if(nums.length%2!=0){
            return nums[mid];
        }
        return (nums[mid] + nums[mid-1])/2;
    }
}