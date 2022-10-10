class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1){
            return "";
        }
        StringBuilder sb = new StringBuilder(palindrome);
        if(palindrome.length()==3 || palindrome.length()==2){
            if(palindrome.charAt(0)!='a'){
                sb.setCharAt(0,'a');
            }
            else{
                sb.setCharAt(sb.length()-1,'b');
            }
            return sb.toString();
            
        }
        boolean notfound = false;
        int n = palindrome.length();
        int mid = (n/2);
        for(int i=0;i<palindrome.length();i++){
           char c = palindrome.charAt(i);
           // System.out.println(mid);
            if(n%2!=0 && i==mid){
                continue;
            }
            if(c!='a'){
                notfound=true;
                sb.setCharAt(i,'a');
                break;
            }
                    }  
        if(!notfound){
            sb.setCharAt(sb.length()-1,'b');
        }
    return sb.toString();
    } 
}