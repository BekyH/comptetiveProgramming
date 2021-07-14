import java.util.*;
public class customSortString {
    public String CustomSortString(String order, String str) {
        HashMap<Character,Integer> hashmap = new HashMap<>();
        Set<Character> set = new HashSet();
        Set<Character> lelaset = new HashSet();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
            if(hashmap.containsKey(str.charAt(i))){
                int val = hashmap.get(str.charAt(i));
                val = val+1;
                hashmap.put(str.charAt(i),val);
            }
            else{
                hashmap.put(str.charAt(i),1);
            }
            
        }
        
        for(int i=0;i<order.length();i++){
            if(set.contains(order.charAt(i))){
                int j = hashmap.get(order.charAt(i));
                lelaset.add(order.charAt(i));
                for(int k=0;k<j;k++){
                    sb.append(order.charAt(i));
                }
            }
            
        }
        
        for(int j=0;j<str.length();j++){
            if(lelaset.contains(str.charAt(j))){
                
            }
            else{
                sb.append(str.charAt(j));
            }   
        }
        
        return sb.toString();
    }
}
