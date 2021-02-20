import java.util.HashSet;

public class noOfprovinces {
    public int findCircleNum(int[][] isConnected) {
        HashSet<Integer> visited = new HashSet<>();
        int province = 0;
        for(int i = 0;i<isConnected.length;i++){
            if(!visited.contains(i)){
                dfs(isConnected,i,visited);
                province++;
            }

        }
        return province;
    }
    public void dfs(int[][] isConnected,int city,HashSet<Integer> visited){
        visited.add(city);
        for(int col=0;col<isConnected[city].length;col++){
            if(isConnected[city][col]==1 && !visited.contains(col)){
                dfs(isConnected,col,visited);

            }
        }

    }
}
