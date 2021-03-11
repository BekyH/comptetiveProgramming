package com.company;

import java.util.Arrays;

public class bagOfTokens {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int n = tokens.length;
        int left = 0;
        int right = n-1;
        int score = 0;
        while(left<=right){
            if(P>=tokens[left]){
                P = P - tokens[left];
                score++;
                left++;

            }
            else{
                if(score>0 && left!=right){
                    P = P + tokens[right];

                    score--;
                    right--;
                }
                else{
                    break;
                }

            }
        }
        return score;
    }
}
