class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> a[1] - b[1]);
        int total = 0;
        int n = boxTypes.length;
        for(int [] arr:boxTypes){
            
            
        }
        for(int i=n-1;i>=0;i--){
            int [] arr = boxTypes[i];
            int x = arr[0];
            int y = arr[1];
             // System.out.print(arr[0] + ":" + arr[1] + " ");
            if(truckSize<=0){
                break;
            }
            if(truckSize<x){
                x = truckSize;
                
            }
           
            total = total  + x * y;
            truckSize = truckSize - x;
            
        }
        
        return total;
    }
}