class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int sumOfDigits = 0;
            while(num>0){
                int rightmost = num%10;
                sumOfDigits = sumOfDigits + rightmost;
                num = num/10;
            }
            
            if(map.containsKey(sumOfDigits)){
                  max = Math.max(max,map.get(sumOfDigits)+nums[i]);
                map.put(sumOfDigits,Math.max(nums[i],map.get(sumOfDigits)));
            }
            else{
                map.put(sumOfDigits,nums[i]);
            }
        }
       // System.out.println(map);
        return max==Integer.MIN_VALUE?-1:max;
    }
}