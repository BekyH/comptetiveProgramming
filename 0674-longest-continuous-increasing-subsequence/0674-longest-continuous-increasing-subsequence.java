class Solution {
    public int findLengthOfLCIS(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int max = Integer.MIN_VALUE;
        for(int num:nums){
            if(stack.isEmpty()){
                stack.push(num);
            }
            else{
                if(num>stack.peek()){
                    stack.push(num);
                    
                }
                else{
                    max = Math.max(max,stack.size());
                    stack.clear();
                    stack.push(num);
                }
            }
        }
                    max = Math.max(max,stack.size());
        
        
        return max;
    }
}