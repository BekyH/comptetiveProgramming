class Solution {
    public int numDecodings(String s) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        
        return helper(0,hashmap,s);
        
    }
    public int helper(int index,HashMap<Integer,Integer> hashmap,String s){
            if(index==s.length()){
                return 1;
            }
            if(hashmap.containsKey(index)){
                return hashmap.get(index);
            }
            if(s.charAt(index)=='0'){
                return 0;
            }
            if(index==s.length()-1){
                return 1;
            }
        
        int ans =  helper(index+1,hashmap,s);
        if(Integer.parseInt(s.substring(index,index+2))<=26){
             ans = ans + helper(index+2,hashmap,s);
        }
           
           hashmap.put(index,ans);
           
           return hashmap.get(index);
    }
}