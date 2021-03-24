package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Trianlge {

    public int minimumTotal(List<List<Integer>> triangle) {
        HashMap<List<Integer>,Integer> hashmap = new HashMap<>();
        return dfs(triangle,0,0, hashmap);

    }
    public int dfs(List<List<Integer>> triangle,int row,int col, HashMap<List<Integer>,Integer> hashmap){
        if(row==triangle.size()){
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        list.add(row);
        list.add(col);
        if(hashmap.containsKey(list)){
            return hashmap.get(list);
        }

        int left = dfs(triangle,row+1,col,hashmap);
        int right = dfs(triangle,row+1,col+1,hashmap);


        int current = triangle.get(row).get(col);
        hashmap.put(list,Math.min(left,right) + current);

        return hashmap.get(list);

    }
}