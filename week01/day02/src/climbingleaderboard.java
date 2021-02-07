package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class climbingleaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<ranked.size();i++){
            if(!st.empty()){
                int top = st.peek();
                if(top==ranked.get(i)){
                    continue;

                }
                else{
                    st.push(ranked.get(i));
                }
            }
            else{
                st.push(ranked.get(i));
            }

    }
    int len = st.size() + 1;
        List<Integer> ranks = new ArrayList<>();
        for(int j = 0;j<player.size();j++){
            boolean not_found= true;
            while(!st.empty()){
                int top = st.peek();
                if(top<=player.get(j)){
                    st.pop();
                    len-=1;
                    continue;

                }
                if(top>player.get(j)){

                    ranks.add(len);
                    not_found = false;
                    break;
                }
                len = st.size();
            }
            if (not_found){
                ranks.add(1);
            }

        }
        return ranks;
    }
}
