class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int max_len = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();
        int max_count = 0;
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                int val = map.get(s.charAt(right));
                val = val + 1;
                map.put(s.charAt(right),val);
            }
            else{
                map.put(s.charAt(right),1);
            }
           
           
                while(right-left+1-helper(map)>k){
                      int freq = map.get(s.charAt(left));
                       freq = freq-1;
                       if(freq<=0){
                           map.remove(s.charAt(left));
                       }
                       else{
                           map.put(s.charAt(left),freq);
                       }
                      left++;
                       
                }
            max_len = Math.max(max_len,right-left+1);
                right++;
            
            
        }
        return max_len;
    }
    public int helper(Map<Character,Integer> map){
        int max = 0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            max = Math.max(max,e.getValue());
        }
        
        return max;
    }
}