class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = 0;
        int right = 0;
        int [] result = new int[m+n];
        int i = 0;
        while(left<m && right<n){
            if(nums1[left]<nums2[right]){
                 result[i++] = nums1[left];
                 left++;
            }
            else{
                result[i++] = nums2[right];
                right++;
            }
            
        }
        while(left<m){
            result[i++] = nums1[left++];
        }
        while(right<n){
            result[i++] = nums2[right++];
        }
        int index =0;
        for(int x:result){
            nums1[index++] = x;
        }
    }
}