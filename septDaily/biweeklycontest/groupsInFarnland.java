package comptetiveProgramming.septDaily.biweeklycontest;

import java.util.*;

public class groupsInFarnland {
    public int [][] findFarmland(int[][] land) {
        List<List<Integer>> lists = new ArrayList<>();
        int [][] directions={{1,0},{0,1}};
        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j]==1){
                    land[i][j]=0;
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    int [] end = dfs(land,directions,i,j,new int[2]);
                    list.add(end[0]);
                    list.add(end[1]);
                    lists.add(list);
                }


            }
        }
        int[][] res = lists.stream()                                // Stream<List<Integer>>
                .map(list -> list.stream().mapToInt(i -> i).toArray()) // Stream<int[]>
                .toArray(int[][]::new);


        return res;
    }
    public int[] dfs(int[][] land,int [][] directions, int row, int col,int[] end){
        end[0]=Math.max(end[0],row);
        end[1]=Math.max(end[1],col);
        for(int[] direction:directions){
            int new_row = row + direction[0];
            int new_col = col + direction[1];
            if(new_row>=0 && new_row<land.length && new_col>=0 && new_col<land[0].length && land[new_row][new_col]==1){
                land[new_row][new_col]=0;
                end[0]=Math.max(new_row,end[0]);
                end[1]=Math.max(new_col,end[1]);
                dfs(land,directions,new_row,new_col,end);
            }

        }
        return end;
    }
}
