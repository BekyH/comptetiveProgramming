class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);
     
        String temp = str.replaceFirst("6","9");
        
        return Integer.parseInt(temp);
    }
}