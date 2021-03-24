package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class reduceArraySizeByhalf {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());
        int half = arr.length/2;
        int counter = 0;
        int sum = 0;
        for(int x:arr){
            if(hashmap.containsKey(x)){
                int val = hashmap.get(x);
                val =  val + 1;
                hashmap.put(x,val);
            }
            else{
                hashmap.put(x,1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hashmap.entrySet()){
            max_heap.add(e.getValue());
        }
        while(sum<half){
            sum = sum+max_heap.poll();
            counter++;
        }

        return counter;

    }
}
