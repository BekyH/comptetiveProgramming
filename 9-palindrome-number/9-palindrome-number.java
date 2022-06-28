class Solution {
    public boolean isPalindrome(int x) {
        int orig = x;
        if(x<0){
            return false;
        }
       int num = 0;
        while(x>0){
            int y = x%10;
            num = num * 10 + y;
            x = x/10;
        }
        
        return num==orig;
    }
}