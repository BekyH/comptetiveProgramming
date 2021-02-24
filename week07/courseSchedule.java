import java.util.*;

public class courseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,List<Integer>> adj_list = new HashMap();
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
        }
        int [] countarray = new int[numCourses];

        for(Map.Entry<Integer,List<Integer>> entry:adj_list.entrySet()){
            List<Integer> list = entry.getValue();
            for(int x:list){
                countarray[x]++;
            }
        }

        int x = 50;
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i = 0;i<countarray.length;i++){
            if(countarray[i]==0){
                deque.add(i);

                countarray[i]=x;
            }
        }

        while(!deque.isEmpty()){
            int y = deque.poll();
            result.add(y);
            if(adj_list.containsKey(y)){

                List<Integer> list = adj_list.get(y);
                for(int child:list){
                    countarray[child]--;
                    if(countarray[child]==0){
                        deque.add(child);
                        countarray[child]=x;
                    }
                }
            }
        }

        if(result.size()==numCourses){
            return true;
        }
        return false;


    }

}