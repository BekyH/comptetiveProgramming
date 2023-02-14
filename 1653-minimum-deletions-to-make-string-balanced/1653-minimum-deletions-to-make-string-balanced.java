class Solution {
    public int minimumDeletions(String s) {
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' && !st.empty()){
              //  System.out.println(st);
                st.pop();
                ans++;
            }
            else if(ch=='b'){
                st.push(ch);
            }
            
        }
        
        return ans;
    }
}