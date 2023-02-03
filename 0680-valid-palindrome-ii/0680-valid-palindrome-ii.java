class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int counter = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                boolean is_first = is_palindrome(s,left+1,right);
                boolean is_second = is_palindrome(s,left,right-1);
                
                return is_first || is_second;
                
            }
            left++;
            right--;
            
        }
        
        return true;
        
    }
    
    public boolean is_palindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else{
                return false;
            }
        }
        
        return true;
    }
}