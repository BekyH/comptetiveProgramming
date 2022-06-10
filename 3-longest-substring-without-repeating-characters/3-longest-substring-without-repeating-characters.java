class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;
        
        while(right<s.length()){
              while (left<s.length() &&  set.contains(s.charAt(right))){
                      set.remove(s.charAt(left));
                      left++;
              }
            set.add(s.charAt(right));
            max = Math.max(right-left+1,max);
            right++;
        }
        
        return max==Integer.MIN_VALUE? 0:max;
    }
}