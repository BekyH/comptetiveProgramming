import java.util.Arrays;

public class twosum {
    boolean isfound;
    public int[]  twoSu(int[]arr, int target){

        int[] results=new int[2];
         isfound=false;
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    results[0]=i;
                    results[1]=j;
                    isfound = true;
                    return results;
                }

            }
        }
       // printArray(results);
        return results;

    }
    public void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public int[] tsu(int[] arr,int target){
        int j = 0;
        int []res=new int[2];
        for(int i = 0;i<arr.length;i++){

        }
        return res;

    }


}
