class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        
        for(String str:words){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
                int index = str.charAt(i)-'a';
                sb.append(morseCode[index]);
                
            }
            set.add(sb.toString());
        }
    
        return set.size();
    }
}