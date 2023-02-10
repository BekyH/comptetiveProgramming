class Solution {
    public int numOfPairs(String[] nums, String target) {
        int counter= 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    String first = nums[i];
                    String second = nums[j];
                  String temp =   first.concat(second);
                    if(temp.equals(target)){
                        counter++;
                    }
                }
            }
        }
        
        return counter;
    }
}