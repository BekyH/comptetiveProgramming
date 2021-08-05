import java.util.*;
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> mapped = new HashSet<>();
        HashMap<Character,Character> hashmap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                sb.append(hashmap.get(s.charAt(i)));
            }
            else{
                if(mapped.contains(t.charAt(i))){
                    break;
                }
                sb.append(t.charAt(i));
                hashmap.put(s.charAt(i),t.charAt(i));
                mapped.add(t.charAt(i));
            }
        }
        String str = sb.toString();
        if(t.equals(str)){
            return true;
        }
        return false;
        
    }
}

