package com.company;

import java.util.PriorityQueue;

public class maxSumOfArrayAfterKNegations {
    public int largestSumAfterKNegations(int[] A, int K) {
        int max_sum = 0;
        PriorityQueue<Integer> min_heap = new PriorityQueue<>();
        for(int i:A){
            min_heap.add(i);
        }
        int j = 0;
        while(j<K){
            int x = min_heap.poll();
            x = x*(-1);
            min_heap.add(x);
            j++;
        }
        for(int i:min_heap){
            max_sum = max_sum + i;
        }
        return max_sum;
    }

}
