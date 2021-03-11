package com.company;

public class getEqualSubStringsWithBudget {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int cost = 0;
        int k = s.length();
        while(right<k){
            cost = Math.abs(s.charAt(right)-t.charAt(right));
            if(cost<=maxCost){
                maxCost = maxCost-cost;
                right++;
            }
            else{
                maxLength = Math.max(maxLength,right-left);
                while(maxCost<cost){
                    cost = Math.abs(s.charAt(left)-t.charAt(left));
                    maxCost = maxCost+cost;
                    left++;
                }
            }
        }
        maxLength = Math.max(maxLength,right-left);
        return maxLength;
    }
}
