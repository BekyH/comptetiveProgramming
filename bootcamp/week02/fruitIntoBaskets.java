package com.company;

import java.util.HashSet;

public class fruitIntoBaskets {
    public int totalFruit(int[] tree) {
        int left = 0;
        int right = 0;
        int counter = 0;
        int max_counter = 0;
        HashSet<Integer> basket1 = new HashSet<>();
        HashSet<Integer> basket2 = new HashSet<>();

        while(right<tree.length){

            if(basket1.isEmpty() && !basket2.contains(tree[left])){
                basket1.add(tree[left]);
                right = left+1;
                counter++;
            }

            else if(basket2.isEmpty() && !basket1.contains(tree[right])){
                basket2.add(tree[right]);
                right++;
                counter++;
            }

            else if(!basket1.contains(tree[right]) && !basket2.contains(tree[right])){
                max_counter = Math.max(counter,max_counter);
                counter = 0;
                basket1.clear();
                basket2.clear();
                left++;
            }

            else{
                counter++;
                right++;
            }
        }

        max_counter = Math.max(counter,max_counter);
        return max_counter;
    }
}

