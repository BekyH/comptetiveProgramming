class Solution {
    public int racecar(int target) {
        Deque<car> deque =  new ArrayDeque<>();
        Set<Pair<Integer,Integer>> visited = new HashSet<>();
        car start = new car(0,1,0);
        deque.add(start);
        visited.add(new Pair(0,1));
        while(!deque.isEmpty()){
            car c = deque.poll();
            int currpos = c.pos;
            int currsp = c.speed;
            int step = c.step;
            if(currpos==target){
                return step;
            }
            
            int accpos = currpos + currsp;
            int accsp = currsp * 2;
            int revpos = currpos;
            int revsp = 1;
            if(currsp>0){
                revsp = -1;
            }
            Pair<Integer,Integer> p = new Pair(accpos,accsp);
            if(!visited.contains(p) && accpos<=2*target && accpos>=0){
            car acccar = new car(accpos,accsp,step+1);
            deque.add(acccar);
             visited.add(p);
            }
            Pair<Integer,Integer> p2 = new Pair(revpos,revsp);
           
            if(!visited.contains(p2) && revpos<=2*target && revpos>=0){
            car revcar = new car(revpos,revsp,step+1);
            deque.add(revcar);
                
            visited.add(p2);
            }
      
        }
        
        return 1;
    }
    
}
class car{
    int pos;
    int speed;
    int step;
    car(int pos,int speed,int step){
        this.pos = pos;
        this.speed = speed;
        this.step = step;
    }
}