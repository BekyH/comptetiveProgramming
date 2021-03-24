package com.company;

import java.util.HashMap;
import java.util.PriorityQueue;

public class theWeakestRow {

    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<weak> min_heap = new PriorityQueue<>();
        int[] res = new int[k];
        int counter = 0;
        for(int i = 0;i<mat.length;i++){
            counter = 0;
            for(int j = 0;j<mat[i].length;j++){
                if(mat[i][j]==1){
                    counter++;
                }
            }
            weak w = new weak(i,counter);
            min_heap.add(w);
        }

        int j = 0;
        int x = 0;
        while(j<k){
            weak p =min_heap.poll();
            res[j]=p.row;
            j++;
        }

        return res;
    }
}

class weak  implements Comparable<weak>{
    int row;
    int soliders;
    public weak(int row,int soliders){
        this.row = row;
        this.soliders = soliders;
    }

    @Override
    public int compareTo(weak w) {
        if(soliders==w.soliders){
            return row-w.row;
        }
        return soliders - w.soliders;

    }


}
