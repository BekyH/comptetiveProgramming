class Solution {
    public String convertToTitle(int columnNumber) {
       int n = columnNumber;
       StringBuilder sb = new StringBuilder();
       
       while(n>0){
           n--;
           int temp = n%26;
           sb.append((char)('A'+temp));
           n = n/26;
           
       }
        
        return sb.reverse().toString();
    }
}