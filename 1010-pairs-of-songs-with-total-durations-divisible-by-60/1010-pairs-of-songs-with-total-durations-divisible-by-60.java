class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int counter = 0;
        for(int i=0;i<time.length;i++){
            int t = time[i];
            int rem = t %60;
            if(rem==0 && hashmap.containsKey(0)){
                counter = counter + hashmap.get(0);
            }
            else{
                if(hashmap.containsKey(60-rem)){
                    counter = counter + hashmap.get(60-rem);
                }
            }
            if(hashmap.containsKey(rem)){
                int curr = hashmap.get(rem);
                hashmap.put(rem,curr+1);
            }
            else{
                hashmap.put(rem,1);
            }
        }
        
        return counter;
    }
}