class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str:strs){
            
            char [] chararr = str.toCharArray();
            Arrays.sort(chararr);
            String tempstr = new String(chararr);
            if(map.containsKey(tempstr)){
                map.get(tempstr).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(tempstr,list);
            }
        }
        
        for(Map.Entry<String,List<String>> e:map.entrySet()){
            result.add(e.getValue());
            
        }
        
        return result;
    }
}