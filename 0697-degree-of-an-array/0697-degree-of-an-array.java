class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        HashMap<Integer,List<Integer>> indexes = new HashMap();
        
        List<Integer> freq = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(nums[i])){
                
                int val = hashmap.get(nums[i]);
                val = val +1;
                
                hashmap.put(nums[i],val);
                List<Integer> lst = indexes.get(nums[i]);
                lst.set(1,i);
                indexes.put(nums[i],lst);
                
                
            }
            else{
                List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(0);
                indexes.put(nums[i],list);
                hashmap.put(nums[i],1);
            }
        }
        int max_freq = 0;
        int min_len = Integer.MAX_VALUE;
        
        for(Map.Entry<Integer,Integer> e:hashmap.entrySet()){
            freq.add(e.getValue());
            
        }
        max_freq = Collections.max(freq);
        for(Map.Entry<Integer,Integer> e:hashmap.entrySet()){
        
            if(max_freq==e.getValue()){
                List<Integer> list = indexes.get(e.getKey());
                //System.out.println(e.getKey() + ":" + list);
                
                int diff = Math.abs(list.get(1)-list.get(0));
                 min_len = Math.min(diff,min_len);
                 
                }
        }
        
        return min_len+1;
    }
}