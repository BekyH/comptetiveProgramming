class Solution {
    public boolean equationsPossible(String[] equations) {
        int [] parents = new int[26];
        int [] size = new int[26];
        for(int i=0;i<26;i++){
            parents[i] = i;
            size[i] = 1;
        }
        for(String equation:equations){
           
            if(equation.charAt(1)=='='){
                union(equation.charAt(0)-'a',equation.charAt(3)-'a',parents,size);
            }
        }
         for(String equation:equations){
           
            if(equation.charAt(1)=='!'){
                int p_u = find(parents,equation.charAt(0)-'a');
                int p_v = find(parents,equation.charAt(3)-'a');
                if(p_u==p_v){
                    return false;
                }
                
            }
        }
        
        return true;
    }
    
    public void union(int x,int y,int [] parents,int [] size){
        int parent_x = find(parents,x);
        int parent_y = find(parents,y);
        if(parent_x==parent_y){
            return;
        }
        if(size[parent_x]>size[parent_y]){
            parents[parent_y] = parents[parent_x];
            size[parent_x] = size[parent_x] + size[parent_y];
        }
        else{
            parents[parent_x] = parents[parent_y];
            size[parent_y] = size[parent_y] + size[parent_x];
        }
    }
    
    public int find(int [] parents,int x){
        if(x==parents[x]){
            return parents[x];
        }
        parents[x] = find(parents,parents[x]);
        
        return parents[x];
    }
}