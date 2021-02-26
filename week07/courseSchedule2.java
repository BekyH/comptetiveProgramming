import java.util.*;

public class courseSchedule2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adj_list = new HashMap();
        HashMap<Integer,Integer> indegree = new HashMap<>();
        int[] result = new int[numCourses];
        int index = 0;
        Deque<Integer> deque = new ArrayDeque<>();

        for(int[] edges:prerequisites){
            List<Integer> list = adj_list.get(edges[1]);
            if(list==null){
                list = new ArrayList();
                list.add(edges[0]);
                adj_list.put(edges[1],list);
            }
            else{
                list.add(edges[0]);
                adj_list.put(edges[1],list);
            }
            if(indegree.containsKey(edges[0])){
                int val = indegree.get(edges[0]);
                val = val +1;
                indegree.put(edges[0],val);
            }
            else{
                indegree.put(edges[0],1);
            }
        }

        for(int i=0;i<numCourses;i++){
            if(!indegree.containsKey(i)){

                indegree.put(i,0);
            }
        }

        for(Map.Entry<Integer,Integer> entry:indegree.entrySet()){
            if(entry.getValue()==0){
                deque.add(entry.getKey());
            }
        }
        if(deque.isEmpty()){

            for(int i=0;i<numCourses;i++){
                result[i]=i;

            }
        }
        else if(deque.isEmpty()){
            return new int[0];
        }

        while(!deque.isEmpty()){
            int popped = deque.poll();
            result[index]=popped;
            index++;
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

        if(indegree.size()>0){
            return new int[0];
        }
        return result;

    }
}

