class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
    Set<Integer> set = new HashSet<>();
        int max_limit = (int)Math.pow(10,n-1);
        for(int i=1;i<10;i++){
            deque.add(i);
        }
        
        
        while(!deque.isEmpty()){
             int num = deque.poll();
             if(num>=max_limit){
                 set.add(num);
                 continue;
             }
            int curr_digit = num % 10;
            int x = curr_digit + k;
            int  y = curr_digit-k;
            if(x >=0 && x<=9){
                x = num * 10 + x;
                deque.add(x);
            }
            if(y>=0 && y<=9){
                
            
            y = num * 10 + y;
            deque.add(y);
            }
        }
        int [] res = new int[set.size()];
        int i = 0;
         for(int x:set){
             res[i++] = x;
         }
        //System.out.println(set);
        return res;
        
    }
}