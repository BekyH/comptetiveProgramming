import java.util.*;

public class courseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adj_list = new HashMap();
        HashMap<Integer,Integer> indegree = new HashMap<>();

        for(int[] edges:prerequisites){
            List<Integer> list = adj_list.get(edges[1]);
            if(list==null){
                list = new ArrayList<>();
                list.add(edges[0]);
                adj_list.put(edges[1],list);
            }
            else{
                list.add(edges[0]);
                adj_list.put(edges[1],list);
            }
        }

        for(Map.Entry<Integer,List<Integer>> entry:adj_list.entrySet()){
            List<Integer> list = entry.getValue();
            for(int x:list){
                if(indegree.containsKey(x)){
                    int val = indegree.get(x);
                    val = val +1;
                    indegree.put(x,val);

                }
                else{
                    indegree.put(x,1);
                }
            }
        }


        for(int i=0;i<numCourses;i++){
            if(!indegree.containsKey(i)){

                indegree.put(i,0);
            }

        }


        Deque<Integer> deque = new ArrayDeque<>();
        for(Map.Entry<Integer,Integer> entry:indegree.entrySet()){
            if(entry.getValue()==0){
                deque.add(entry.getKey());
            }
        }
        List<Integer> result = new ArrayList<>();
        if(deque.isEmpty()){

            for(int i=0;i<numCourses;i++){
                result.add(i);
            }
        }
        else if(deque.isEmpty()){
            int[] res = {};

            return res;
        }
        while(!deque.isEmpty()){
            int popped = deque.poll();

            result.add(popped);
            indegree.remove(popped);
            if(adj_list.containsKey(popped)){
                List<Integer> list = adj_list.get(popped);
                for(int child:list){
                    int ind = indegree.get(child);
                    ind = ind-1;
                    if(ind==0){
                        deque.add(child);




                    }
                    else{
                        indegree.put(child,ind);
                    }
                }
            }

        }
        int[] res = new int[result.size()];
        int index = 0;
        if(indegree.size()>0){
            return new int[0];
        }

        for(int k:result){

            res[index]=k;
            index++;
        }
        return res;

    }
}

        