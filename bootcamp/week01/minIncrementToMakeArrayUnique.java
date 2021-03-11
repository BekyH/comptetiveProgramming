package com.company;

import java.util.Arrays;

public class minIncrementToMakeArrayUnique {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int moves = 0;
        for(int i = 1;i<A.length;i++){
            if(A[i-1]==A[i]){
                A[i]++;
                moves++;
            }
            else if(A[i-1]>A[i]){
                int diff = A[i-1]-A[i];
                A[i] = A[i] +diff+1;
                moves = moves + diff+1;

            }
        }
        return moves;
    }
}
