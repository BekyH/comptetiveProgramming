class Solution {
    public String reverseWords(String s) {
        String[] str = s.split(" ");
        for(int i=0;i<str.length;i++){
            str[i] = reverse(str[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(String word:str){
            sb.append(word);
            sb.append(" ");
        }
        
        return sb.toString().trim();
        
    }
    
    public String reverse(String s){
        char [] st = s.toCharArray();
        int left = 0;
        int right = st.length-1;
        while(left<right){
            char temp = st[left];
            st[left] = st[right];
            st[right] = temp;
            left++;
            right--;
        }
        StringBuilder sb = new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}