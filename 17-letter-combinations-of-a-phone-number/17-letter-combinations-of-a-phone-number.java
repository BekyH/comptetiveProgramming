class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        HashMap<Character,char[]> letters = new HashMap<>();
        letters.put('2', new char[]{'a', 'b', 'c'});
        letters.put('3', new char[]{'d', 'e', 'f'});
        letters.put('4', new char[]{'g', 'h', 'i'});
        letters.put('5', new char[]{'j', 'k', 'l'});
        letters.put('6', new char[]{'m', 'n', 'o'});
        letters.put('7', new char[]{'p', 'q', 'r', 's'});
        letters.put('8', new char[]{'t', 'u', 'v'});
        letters.put('9', new char[]{'w', 'x', 'y', 'z'});   
        if(digits.length()==0){
            return result;
        }
        dfs(new StringBuilder(),digits,0,result,letters);
        return result;
    }
    public void dfs(StringBuilder path,String digits,int index,List<String>result,HashMap<Character,char[]> hashmap){
            
             if(index<=digits.length()){
                
             
        if(path.length()==digits.length()){
                // System.out.println("here");
                 result.add(path.toString());
                // path = new StringBuilder();
                 return;
              }
        
        char[] list = hashmap.get(digits.charAt(index));
        for(char c:list){
            dfs(path.append(c),digits,index+1,result,hashmap);
            path.deleteCharAt(path.length()-1);
        
        }
    }
    }
}