class Solution {
    public int removeStones(int[][] stones) {
        HashMap<List<Integer>, List<List<Integer>>> graph = new HashMap();
        HashSet<List<Integer>> visited = new HashSet<>();
        Stack<List<Integer>> stack = new Stack<>();
        int numOfGroups = 0;
        for(int i=0;i<stones.length;i++){
            for(int j=0;j<stones.length;j++){
                if(i!=j){
                    if(stones[i][0]==stones[j][0] || stones[i][1]==stones[j][1]){
                        List<Integer> list2 = new ArrayList<>();
                             for(int m:stones[i]){
                                 list2.add(m);
                             }
                        List<List<Integer>> list = graph.get(list2);
                         List<Integer> list1;
                        if(list==null){
                             list = new ArrayList<>();
                             list1 = new ArrayList<>();
                              for(int k:stones[j]){
                                  list1.add(k);
                              }
                             
                             list.add(list1);
                            
                             graph.put(list2,list);
                        }
                        else{
                          list1 = new ArrayList<>();
                            for(int k:stones[j]){
                                  list1.add(k);
                              }
                             list.add(list1);
                             graph.put(list2,list);
                        }  
                        }
                    }
                }
            }
        List<Integer> list;        
        for(int[] arr:stones){
            list = new ArrayList<>();
            for(int x:arr){
                list.add(x);
            }
            if(!visited.contains(list)){
                visited.add(list);
                stack.add(list);
                numOfGroups++;
            }
            while(!stack.isEmpty()){
                List<Integer> ls = stack.pop();
                List<List<Integer>> lists = graph.get(ls);
                if(lists!=null){
                   for(List<Integer> child:lists){
                    if(!visited.contains(child)){
                        visited.add(child);
                        stack.add(child);
                    }
                } 
                }
                
            }
        }
        
        return stones.length-numOfGroups;
    }
}