import java.util.*;
public class StoneGame {
    public boolean stoneGame(int[] piles) {
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i:piles){
            deque.add(i);
        }
        int alexstones=0;
        int leestones=0;
        while(!deque.isEmpty()){
            int val1 = deque.getFirst();
            int val2 = deque.getLast();
           if(val1>val2){
               alexstones = alexstones+val1;
               deque.pollFirst();
               int val3 = deque.getFirst();
               if(val3<val2){
                   leestones = leestones + val3;
                   deque.pollFirst();
               }
               else{
                   leestones = leestones + val2;
                   deque.pollLast();
               }
           }
            else{
                alexstones = alexstones + val2;
                deque.pollLast();
                int val4 = deque.getLast();
                if(val4<val1){
                    leestones = leestones + val4;
                    deque.pollLast();
                }
                else{
                    leestones = leestones + val1;
                    deque.pollFirst();
                }
            }
        }
        if(alexstones>leestones){
            return true;
        }
        return false;
    }
}