class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> frequencies = new HashMap<>();
        HashSet<Integer> hashset = new HashSet<>();
        for(int value:arr){
            if(frequencies.containsKey(value)){
                frequencies.put(value,frequencies.get(value) +1);
            }
               else{
                   frequencies.put(value,1);
               }
        }
        for(Map.Entry<Integer,Integer> freq:frequencies.entrySet()){
            hashset.add(freq.getValue());
        }
        if(hashset.size()==frequencies.size()){
            return true;
        }
        return false;
               
    }
}