class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] result = new int[m+n];
        int left = 0;
        int right = 0;
        int index=0;
        while(left < m && right<n){
            if(nums1[left]<nums2[right]){
                result[index++] = nums1[left];
                left++;
            }
            else{
                result[index++] = nums2[right];
                right++;
            }
        }
        while(left<m){
            result[index++] = nums1[left++];
        }
        while(right<n){
            result[index++] = nums2[right++];
        }
        int i=0;
        for(int num:result){
            nums1[i++] = num;
        }
    }
}