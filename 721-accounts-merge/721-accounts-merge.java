class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,List<String>>  map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        Set<String> visited = new HashSet<>();
        for(List<String> lst:accounts){
            String name = lst.get(0);
            String first = lst.get(1);
            for(int i=2;i<lst.size();i++){
                String curr = lst.get(i);
                if(map.containsKey(first)){
                    map.get(first).add(curr);
                }
                else{
                    map.put(first,new ArrayList<>());
                    map.get(first).add(curr);
                }
                if(map.containsKey(curr)){
                    map.get(curr).add(first);
                    
                }
                else{
                    map.put(curr,new ArrayList<>());
                    map.get(curr).add(first);
                }
            }
        }
        for(List<String> ls:accounts){
            String name = ls.get(0);
            TreeSet lst = new TreeSet();
            
            
            dfs(map,visited,lst,ls.get(1));
            if(lst.size()>0){
                List<String> list = new ArrayList<>((lst));
                list.add(0,name);
                result.add(list);
                
            }
            
            
        }
        
        return result;
    }
    
    public void dfs(HashMap<String,List<String>> map,Set<String> visited,TreeSet lst,String str){
        if(visited.contains(str)){
            return;
        }
        lst.add(str);
        visited.add(str);
        List<String> children = map.get(str);
        if(children!=null){
             for(String child:children){
            if(!visited.contains(child)){
                dfs(map,visited,lst,child);
            }
            
        }
        }
       
    }
}