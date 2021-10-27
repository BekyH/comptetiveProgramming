import java.util.*;
public class randomizedSet {
    List<Integer> list;
       HashMap<Integer,Integer> hashmap;
       Random random;
       public randomizedSet() {
           list = new ArrayList<>();
           hashmap = new HashMap<>();
           random = new Random();
       }
       
       public boolean insert(int val) {
           
           if(hashmap.containsKey(val)){
               return false;
           }
           list.add(val);
           hashmap.put(val,list.size()-1);
           
           return true;
       }
       
       public boolean remove(int val) {
           if(!hashmap.containsKey(val)){
               return false;
           }
           int i = hashmap.get(val);
           int temp = list.get(i);
           int value = list.get(list.size()-1);
           list.set(i,value);
           list.set(list.size()-1,temp);
           hashmap.put(value,i);
           list.remove(list.size()-1);
           hashmap.remove(val);
           return true;
           
       }
       
       public int getRandom() {
           //System.out.println(list);
           return list.get(random.nextInt(list.size()));
       }
   }
   
   /**
    * Your RandomizedSet object will be instantiated and called as such:
    * RandomizedSet obj = new RandomizedSet();
    * boolean param_1 = obj.insert(val);
    * boolean param_2 = obj.remove(val);
    * int param_3 = obj.getRandom();
    */