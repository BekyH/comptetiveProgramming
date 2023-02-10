class Solution {
    public int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int [] ans = new int[n];
      int left = 0;
      int right = n-1;
      int index = n-1;
      while(left<=right){
          int leftnum = Math.abs(nums[left]);
          int rightnum = Math.abs(nums[right]);
          if(leftnum>rightnum){
              ans[index] = leftnum*leftnum;
              left++;
          }
          else{
              ans[index] = rightnum*rightnum;
              right--;
          }
          index--;
      }
      
        return ans;
    }
}