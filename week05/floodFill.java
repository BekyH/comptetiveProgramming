import java.util.ArrayList;
import java.util.List;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orginalcolor = image[sr][sc];
        if(orginalcolor==newColor){
            return image;
        }
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        int numOfRow = image.length;
        int numOfCol = image[0].length;
        image =floodFillHelper(image,orginalcolor,newColor,numOfRow,numOfCol,directions,sr,sc);
        return image;
    }

    public int[][] floodFillHelper(int[][] image,int orginalcolor,int newColor,int num_row,int num_col,int[][]directions, int sr,int sc){
        image[sr][sc] = newColor;

        for(int[] direction:directions){
            int newrow = sr + direction[0];
            int newcol = sc + direction[1];

            if((0<=newrow && newrow<num_row) && (0<=newcol && newcol<num_col)){
                if(image[newrow][newcol]==orginalcolor){
                    floodFillHelper(image,orginalcolor,newColor,num_row,num_col,directions,newrow,newcol);
                }

            }

        }

        return image;
    }

}


