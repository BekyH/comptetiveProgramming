class Solution {
    public int prefixCount(String[] words, String pref) {
        int counter = 0;
        boolean is_found = true;
      
        for(String word:words){
            if(pref.length()>word.length()){
                continue;
            }
            for(int i=0;i<pref.length();i++){
                if(word.charAt(i)==pref.charAt(i)){
                    is_found = true;
                    
                }
                else{
                    is_found = false;
                    break;
                }
            }
            if(is_found){
                counter++;
            }
            
        }
        
        return counter;
    }
}