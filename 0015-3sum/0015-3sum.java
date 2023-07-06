class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
         int num1 = 0;
         int num2 = 0;
         int num3 = 0;
        List<Integer> list = new ArrayList<>();
         for(int i=0;i<nums.length;i++){
             
             num1 = nums[i];
             int left = i+1;
             int right = nums.length-1;
             while(left<right){
                 num2 = nums[left];
                 num3 = nums[right];
                 int sum = num1 + num2+num3;
                 if(sum==0){
                     list.add(num1);
                     list.add(num2);
                     list.add(num3);
                  //   System.out.println(list);
                     set.add(new ArrayList<>(list));
                     
                     left++;
                     right--;
                     list.clear();
                   //  System.out.println(set);
                     //break;
                 }
                 else if(sum>0){
                     right--;
                 }
                 else{
                     left++;
                 }
                 
                
             }
            // list.clear();
         }
         
         return new ArrayList<>(set);
    }
}