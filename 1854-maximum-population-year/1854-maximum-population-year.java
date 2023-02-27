class Solution {
    public int maximumPopulation(int[][] logs) {
        int max = 0;
        int [] years = new int[101];
        int earlyYear = 1950;
        for(int [] log:logs){
            int b = log[0];
            int d = log[1];
            for(int i=b;i<d;i++){
                int curr = i-1950;
                years[curr]++;
                if(years[curr]>max){
                    max = years[curr];
                    earlyYear = i;
                }
                else if(years[curr]==max){
                    if(earlyYear>i){
                        earlyYear = i;
                    }
                    
                }
                
            }
        }
        
        return earlyYear;
    }
}