class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        HashMap<Integer,Integer> index = new HashMap<>();
        HashMap<Integer,Integer> map =  new HashMap<>();
        int [] result = new int[spells.length];
        for(int i=0;i<spells.length;i++){
            index.put(i,spells[i]);
        }
        Arrays.sort(spells);
        Arrays.sort(potions);
        int right = potions.length-1;
        int left = 0;
        int curr_count = 0;
        int prev_count = 0;
        int total = 0;
        while(left<spells.length){
            if(map.containsKey(spells[left])){
                left++;
                continue;
            }
            if(right<0){
                    break;
                }
           Long l = Long.valueOf(spells[left]) * Long.valueOf(potions[right]);
            while(right>=0 && l >=success){
                   curr_count++;
                   right--;
                if(right<0){
                    break;
                }
                     l = Long.valueOf(spells[left]) * Long.valueOf(potions[right]);
                
               
            }
             total = prev_count + curr_count;
            curr_count = 0;
             map.put(spells[left],total);
            
            prev_count = total;
            left++;
        }
        while(left<spells.length){
            map.put(spells[left++],total);
            
        }
            for(int i=0;i<result.length;i++){
                result[i] = map.get(index.get(i));
                
            }
            
            
           return result; 
            
        
    
    }
}