class Solution {
    public int[] findOriginalArray(int[] changed) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        if(changed.length==1){
            return new int[0];
        }
        for(int num:changed){
            if(map.containsKey(num)){
                int val = map.get(num);
                val = val+1;
                map.put(num,val);
            }
            else{
                map.put(num,1);
            }
        }
        Arrays.sort(changed);
        for(int num:changed){
            int twice = num * 2;
            if(num==0 && map.containsKey(num)){
                int freq = map.get(num);
                if(freq<2){
                    
                   continue; 
                }
            
                freq = freq-2;
              //  System.out.println(freq);
                if(freq==0){
                    map.remove(num);
                }
                else{
                    map.put(num,freq);
                }
                list.add(num);
            }
        else if(map.containsKey(twice) && map.containsKey(num)){
                int f1 = map.get(num);
                int f2 = map.get(twice);
                f1 = f1-1;
                f2 = f2-1;
                if(f1==0){
                   map.remove(num); 
                }
                if(f2==0){
                    map.remove(twice);
                }
               if(f1>0){
                   map.put(num,f1);
               }
            if(f2>0){
                map.put(twice,f2);
            }
            list.add(num);
            }
        }
        if(map.size()>0){
            return new int[0];
        }
        int [] res = new int[list.size()];
        int index = 0;
        for(int num:list){
           res[index++] = num; 
        }
        
        return res;
    }
}