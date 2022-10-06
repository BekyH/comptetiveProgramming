class TimeMap {
HashMap<String,TreeMap<Integer,String>> hashmap;
    public TimeMap() {
        hashmap = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer,String> tmap;
          if(hashmap.containsKey(key)){
              tmap = hashmap.get(key);
          }
        else{
            tmap = new TreeMap<>();
        }
        tmap.put(timestamp,value);
        hashmap.put(key,tmap);
        
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer,String> tmap = hashmap.get(key);
        if(tmap==null){
            return "";
        }
        Map.Entry<Integer,String> e = tmap.floorEntry(timestamp);
        if(e==null){
            return"";
        }
        return e.getValue();
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */