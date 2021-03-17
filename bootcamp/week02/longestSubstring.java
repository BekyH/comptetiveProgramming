package com.company;

import java.util.HashSet;

public class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> visited = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        int current = 0;
        while(right<s.length()){
            if(visited.contains(s.charAt(right))){
                current = right-left;
                visited.remove(s.charAt(left));
                left++;
            }
            else{
                visited.add(s.charAt(right));
                right++;
            }
            max = Math.max(current,max);

        }
        current = right-left;
        return Math.max(current,max);

    }
}
