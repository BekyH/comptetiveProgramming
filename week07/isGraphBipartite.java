package com.company;

import java.util.*;

public class isGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        HashMap<Integer,List<Integer>> adjList = new HashMap<>();
        Set<Integer> SetA = new HashSet<>();
        Set<Integer> SetB = new HashSet<>();
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> deque = new ArrayDeque<>();

        int j = 0;
        for(int[] edges:graph){
            List<Integer> list = new ArrayList<>();
            for(int x:edges){
                list.add(x);
            }
            adjList.put(j,list);
            j++;
        }

        for(int i = 0;i<graph.length;i++){
            if(!visited.contains(i)){
                SetA.add(i);
                deque.add(i);
                visited.add(i);

            }
            while(!deque.isEmpty()){
                int node = deque.pop();
                List<Integer> childrens = adjList.get(node);
                if(childrens!=null){
                    for(int child:childrens){
                        if(!visited.contains(child)){
                            visited.add(child);
                            deque.add(child);
                            if(SetA.contains(node)){
                                SetB.add(child);
                            }
                            else if(SetB.contains(node)){
                                SetA.add(child);
                            }

                        }
                        else {
                            if(SetA.contains(node) && SetA.contains(child)){
                                return false;

                            }
                            if(SetB.contains(node) && SetB.contains(child)){
                                return false;
                            }
                        }
                    }
                }
            }

        }
        if(deque.isEmpty()){
            return true;
        }
        return false;

    }
}
