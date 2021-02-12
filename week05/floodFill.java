import java.util.ArrayList;
import java.util.List;

public class floodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int orginalcolor = image[sr][sc];
        if(orginalcolor==newColor){
            return image;
        }
        List<List<Integer>> positions = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        list1.add(1);
        list1.add(0);
        list2.add(0);
        list2.add(1);
        list3.add(-1);
        list3.add(0);
        list4.add(0);
        list4.add(-1);
        positions.add(list1);
        positions.add(list2);
        positions.add(list3);
        positions.add(list4);
        int numOfRow = image.length;
        int numOfCol = image[0].length;
        image =floodFillHelper(image,orginalcolor,newColor,numOfRow,numOfCol,positions,sr,sc);
        return image;
    }
    public int[][] floodFillHelper(int[][] image,int orginalcolor,int newColor,int num_row,int num_col,List<List<Integer>> positions,int sr,int sc){
        image[sr][sc] = newColor;

        for(List<Integer> position:positions){
            int newrow = sr + position.get(0);
            int newcol = sc + position.get(1);
            if((0<=newrow && newrow<num_row) && (0<=newcol && newcol<num_col)){
                if(image[newrow][newcol]==orginalcolor){
                    floodFillHelper(image,orginalcolor,newColor,num_row,num_col,positions,newrow,newcol);
                }

            }

        }

        return image;
    }

}
