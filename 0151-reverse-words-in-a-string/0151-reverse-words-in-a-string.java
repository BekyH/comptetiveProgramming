class Solution {
    public String reverseWords(String s) {
        String str = s.trim().replaceAll("\\s+"," ");
        System.out.println(str);
        String [] st = str.split(" ");
        int left = 0;
        int right = st.length-1;
        while(left<right){
            String temp = st[left];
            st[left] = st[right];
            st[right]  = temp;
            left++;
            right--;
        }
        String result = String.join(" ",st);
        return result;
    }
}