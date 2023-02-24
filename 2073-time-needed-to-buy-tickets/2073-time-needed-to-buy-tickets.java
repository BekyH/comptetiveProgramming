class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int tick = tickets[k];
        int time = 0;
        while(tick>0){
            for(int j=0;j<tickets.length;j++){
                if(j==k && tickets[j]-1==0){
                    time++;
                    break;
                }

                if(tickets[j]>0){
                    tickets[j]--;
                    time++;
                }
            }
            tick--;
        }
        return time;
    }
}