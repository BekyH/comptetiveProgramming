import java.util.*;
public class eventualSafe {

 public List<Integer> eventualSafeNodes(int[][] graph) {
        HashMap<Integer,List<Integer>> reversed = new HashMap<>();
        HashMap<Integer,Integer> indegree = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        int n = graph.length;
        boolean [] safenodes = new boolean[n];
        Arrays.fill(safenodes,false);
        for(int i=0;i<n;i++){
            indegree.put(i,0);
        }
        int index=0;
        for(int[] edge:graph){
            List<Integer> lst;
            for(int j=0;j<edge.length;j++){
                     
                if(reversed.containsKey(edge[j])){
                    lst = reversed.get(edge[j]);
                                               }
                else{
                    lst = new ArrayList<>();
                  }
                        
                lst.add(index);
                reversed.put(edge[j],lst);

                int val = indegree.get(index);
                val = val + 1;
                indegree.put(index,val);

                }
                index++;
            }
        for(Map.Entry<Integer,Integer> e:indegree.entrySet()){
            if(e.getValue()==0){
                deque.add(e.getKey());
                
            }
        }
        while(!deque.isEmpty()){
            int node = deque.poll();
            safenodes[node]=true;
            if(reversed.containsKey(node)){
                List<Integer> children = reversed.get(node);
                for(int child:children){
                    int val = indegree.get(child);
                    val = val-1;
                    indegree.put(child,val);
                    if(val==0){
                        deque.add(child);
                    }
                }
            }
        }
        for(int node=0;node<n;node++){
            if(safenodes[node]==true){
                result.add(node);
            }
        }
        return result;
    }
}
