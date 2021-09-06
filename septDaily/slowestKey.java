package comptetiveProgramming.septDaily;
import java.util.*;
public class slowestKey {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int n = releaseTimes.length;
        int max = releaseTimes[0];
        HashMap<Character,Integer> hashmap = new HashMap<>();
        List<Character> list = new ArrayList<>();
        hashmap.put(keysPressed.charAt(0),releaseTimes[0]);
        for(int i=1;i<keysPressed.length();i++){
            int freq = releaseTimes[i]-releaseTimes[i-1];
            max = Math.max(freq,max);
          if(hashmap.containsKey(keysPressed.charAt(i))){
                int val = hashmap.get(keysPressed.charAt(i));
                
                hashmap.put(keysPressed.charAt(i),Math.max(freq,val));
          }
            else{
                hashmap.put(keysPressed.charAt(i),freq);
            }
        }
            for(Map.Entry<Character,Integer> e:hashmap.entrySet()){
                                 if(max==e.getValue()){
                      list.add(e.getKey());
                  }
            }
                if(list.size()==1){
            return list.get(0);
        }
        
        Collections.sort(list);
        return list.get(list.size()-1);
        
        
    }
}
