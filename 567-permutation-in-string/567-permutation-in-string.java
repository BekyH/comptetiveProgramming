class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        int counter = 0;
        for(int i=0;i<s1.length();i++){
            if(map.containsKey(s1.charAt(i))){
                int freq = map.get(s1.charAt(i));
                freq = freq + 1;
                map.put(s1.charAt(i),freq);
            }
            else{
                map.put(s1.charAt(i),1);
            }
            counter++;
        }
      //  System.out.println(counter);
        int left = 0;
        int right = 0;
        while(left<s2.length()){
            
              while(right< s2.length() && right-left+1<=counter){
                  
                  if(map2.containsKey(s2.charAt(right))){
                      int freq =map2.get(s2.charAt(right));
                      freq = freq + 1;
                      map2.put(s2.charAt(right),freq);
                      
                  }
                  else{
                      map2.put(s2.charAt(right),1);
                  }
                  right++;
                  
                  
              }
            
           if(map.equals(map2)){
                  return true;
              }
              int val = map2.get(s2.charAt(left));
               val =val-1;
              map2.put(s2.charAt(left),val);
              if(val==0){
                  map2.remove(s2.charAt(left));
              }
            
            left++;
        }
        
        return map.equals(map2);
    }
}