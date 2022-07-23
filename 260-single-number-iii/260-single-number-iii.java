class Solution {
    public int[] singleNumber(int[] nums) {
        int [] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                freq = freq + 1;
                map.put(nums[i],freq);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int index = 0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                res[index++] = e.getKey();
            }
        }
        
        return res;
    }
}