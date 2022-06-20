class Solution {
    public int findMinDifference(List<String> timePoints) {
        int [] arr = new int[timePoints.size()];
        int index = 0;
        int min = Integer.MAX_VALUE;
        for(String word:timePoints){
            String [] str = word.split(":");
            int hr = Integer.parseInt(str[0]);
            int minutes = Integer.parseInt(str[1]);
            if(str[0].equals("00")){
                hr = 24;
            }
            int totalmin = hr * 60 + minutes;
            arr[index++] = totalmin;
        }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
        int diff =  24*60-arr[arr.length-1] + arr[0];
        //System.out.println(diff);
       min= Math.min(min,diff);
        return min;
    }
}