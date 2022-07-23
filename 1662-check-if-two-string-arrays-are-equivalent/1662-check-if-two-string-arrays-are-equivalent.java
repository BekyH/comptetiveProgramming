class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(String str:word1){
            sb.append(str);
        }
        for(String str2:word2){
            sb1.append(str2);
        }
        
        return sb.toString().equals(sb1.toString());
    }
}