package com.company;

import java.util.*;

public class shortestPath {

        public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
            HashMap<Integer, List<Integer>> red_adjList = new HashMap<>();
            HashMap<Integer,List<Integer>> blue_adjList = new HashMap<>();
            HashSet<String> visited = new HashSet<>();
            Deque<path> deque = new ArrayDeque<>();
            int[] res= new int[n];
            for(int i=1;i<n;i++){
                res[i] = Integer.MAX_VALUE;
            }
            for(int[] edge:red_edges){
                List<Integer> list = red_adjList.get(edge[0]);
                if(list==null){
                    list = new ArrayList<>();
                    list.add(edge[1]);
                    red_adjList.put(edge[0],list);
                }
                else{
                    list.add(edge[1]);
                    red_adjList.put(edge[0],list);
                }
            }
            for(int[] edge:blue_edges){
                List<Integer> list = blue_adjList.get(edge[0]);
                if(list==null){
                    list = new ArrayList<>();
                    list.add(edge[1]);
                    blue_adjList.put(edge[0],list);
                }
                else{
                    list.add(edge[1]);
                    blue_adjList.put(edge[0],list);
                }

            }
            path p = new path(0,"root",0);
            deque.add(p);
            visited.add(0 + " " + "root");
            while(!deque.isEmpty()){
                path parentpath= deque.poll();
                int node = parentpath.node;
                String color = parentpath.color;
                int dist = parentpath.dist;
                res[node] = Math.min(res[node],dist);
                List<Integer> redchildren = red_adjList.get(node);
                List<Integer> bluechildren = blue_adjList.get(node);
                if(redchildren!=null){
                    for(int child:redchildren){
                        if(!visited.contains(child + " " + "red") &&                                                                                           !parentpath.color.equals("red")){
                            path redpath = new path(child,"red",dist +1);

                            deque.add(redpath);
                            visited.add(child + " " + "red");
                        }
                    }
                }

                if(bluechildren!=null){
                    for(int child:bluechildren){
                        if(!visited.contains(child + " " + "blue") &&                                                                                          !parentpath.color.equals("blue")){
                            path bluepath = new path(child,"blue",dist +1);

                            deque.add(bluepath);
                            visited.add(child + " " + "blue");
                        }
                    }

                }

            }

            for(int i = 1;i<n;i++){
                if(res[i]==Integer.MAX_VALUE){
                    res[i]=-1;
                }
            }

            return res;

        }
    }
    class path{
        int node;
        String color;
        int dist;
        path(int node,String color,int dist){
            this.node = node;
            this.color = color;
            this.dist = dist;
        }

    }


