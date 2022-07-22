class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<position.length;i++){
            hashmap.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        Stack<Double> st = new Stack<>();
        for(int i=position.length-1;i>=0;i--){
             
             Double t = ((double)target-position[i])/hashmap.get(position[i]);
            if(!st.isEmpty() && t<=st.peek()){
                
            }
            else{
                st.push(t);
            }
        }
       // System.out.println(st);
        
        return st.size();
    }
}