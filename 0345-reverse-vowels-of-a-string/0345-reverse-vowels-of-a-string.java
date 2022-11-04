class Solution {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        for(int i=0;i<vowels.length();i++){
            set.add(vowels.charAt(i));   
        }
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(set.contains(s.charAt(left)) && set.contains(s.charAt(right))){
                
                char temp = s.charAt(left);
                sb.setCharAt(left,s.charAt(right));
                sb.setCharAt(right,s.charAt(left));
                right--;
            }
            else if(!set.contains(s.charAt(right))){
                right--;
                continue;
            }
            
            left++;
            

        }
        return sb.toString();
    }
}