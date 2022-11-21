class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        
        
        int m = maze.length;
        int n = maze[0].length;
        boolean isborder = false;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i ==0 || i==m-1 || j==0 || j==n-1 && maze[i][j]=='.' && (i!=entrance[0] || j!=entrance[1])){
                    isborder = true;
                    break;
                }
            }
        }
        if(!isborder){
            return -1;
        }
        int min_steps = 0;
        int enter_row = entrance[0];
        int enter_col = entrance[1];
        PriorityQueue<Node> min_heap = new PriorityQueue<>();
        boolean [][] visited = new boolean[m][n];
      //  Arrays.fill(visited,false);
        Node root = new Node(entrance[0],entrance[1],0);
        visited[entrance[0]][entrance[1]] = true;
        int [][] directions ={{1,0},{0,1},{-1,0},{0,-1}};
        min_heap.add(root);
        int exit = -1;
        List<Integer> ls = new ArrayList<>();
        
        while(!min_heap.isEmpty()){
            Node node = min_heap.poll();
            int orow = node.row;
            int ocol = node.col;
            int step = node.steps;
            //visited[orow][ocol] = true;
             if(is_border(m,n,orow,ocol) && (orow!=enter_row || ocol!=enter_col)){
                 //ls.add(step);
              // System.out.println(orow + ":" + ocol);
                 exit = step;
                 break;
             }
            for(int [] direction:directions){
                int new_row = orow + direction[0];
                int new_col = ocol + direction[1];
                
               if(new_row<m && new_row>=0 && new_col<n && new_col>=0 && !visited[new_row][new_col] && maze[new_row][new_col]=='.'){
                  visited[new_row][new_col] = true;
                   Node child = new Node(new_row,new_col,step+1);
                   min_heap.add(child);
               }
                
            }
        }
//         if(ls.size()>0){
            
//             return Collections.min(ls);
//         }
        return exit;
        
    }
    public boolean is_border(int m,int n,int row,int col){
        if(row==0 || row==m-1 || col==0 || col==n-1){
            return true;
        }
        return false;
    }
}

class Node implements Comparable<Node>{
    int row;
    int col;
    int steps;
    public Node(int row,int col,int steps){
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
     @Override
    public int compareTo(Node node) {
       
        return steps - node.steps;
    }

    
}