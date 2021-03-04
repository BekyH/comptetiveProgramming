import java.util.*;

public class collectAllApples {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer,List<Integer>> adjList = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        for(int[] edge:edges){
            List<Integer> list = adjList.get(edge[0]);
            List<Integer> list1;
            if(list==null){
                list = new ArrayList<>();
                list.add(edge[1]);
                adjList.put(edge[0],list);
                list1 = new ArrayList<>();
                list1.add(edge[0]);
                adjList.put(edge[1],list1);

            }
            else{
                list.add(edge[1]);
                adjList.put(edge[0],list);
                list1 = new ArrayList<>();
                list1.add(edge[0]);
                adjList.put(edge[1],list1);

            }

        }
        int total = minTimeHelper(0,visited,adjList,hasApple);
        if(total==0){
            return total;
        }
        return total-2;

    }

    public int minTimeHelper(int node,Set<Integer> visited,HashMap<Integer,List<Integer>> adjList,List<Boolean> hasApple){
        if(visited.contains(node)){
            return 0;
        }
        visited.add(node);
        int time = 0;
        for(int child:adjList.get(node)){

            time = time + minTimeHelper(child,visited,adjList,hasApple);
        }
        if(hasApple.get(node)==true || time>0){
            return time +2;
        }
        else{
            return 0;
        }

    }
}

