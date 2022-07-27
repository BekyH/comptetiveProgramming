class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> min_list = new ArrayList<>();
        for(String str:timePoints){
            String [] splittd = str.split(":");
            if(splittd[0].equals("00")){
                splittd[0] = "24";
                
            }
            int hrtomin = Integer.parseInt(splittd[0]) * 60 + Integer.parseInt(splittd[1]);
            min_list.add(hrtomin);
            
        }
        Collections.sort(min_list);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<min_list.size();i++){
            min = Math.min(min,min_list.get(i)-min_list.get(i-1));
        }
        // 24 hr cycle. it is cyclic. So we have to do this check.
        int lastdiff = 24*60 -min_list.get(min_list.size()-1) + min_list.get(0);
        min = Math.min(lastdiff,min);
        return min;
        
    }
}