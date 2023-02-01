class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = ages.length;
        List<Node> team = new ArrayList<>();
        for(int i=0;i<n;i++){
            team.add(new Node(ages[i],scores[i]));
        }
        
        Collections.sort(team,(p1,p2)->p1.a==p2.a? p1.s-p2.s:p1.a-p2.a);
       // Collections.reverse(team);
       // System.out.println(team.get(0).s);
        
        int [] memo = new int[n];
        int best = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int curr = team.get(i).s;
            memo[i] = curr;
            for(int j=0;j<i;j++){
                if(curr>=team.get(j).s){
                  memo[i] = Math.max(memo[i],memo[j] +curr);
                }
            }
            best = Math.max(best,memo[i]);
        }
        
      return best;  
    }
}

class Node{
    int a;
    int s;
    Node(int a,int s){
        this.a = a;
        this.s = s;
        
    }
}