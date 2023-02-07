class Solution {
    public int minOperations(String[] logs) {
         int counter = 0;
        String back = "../";
        String remain="./";
        for(int i = 0;i<logs.length;i++){
            if(!logs[i].equals(back) && !logs[i].equals(remain)){
                counter++;
            }
            else if(logs[i].equals(back)){
                if(counter>0){
                    counter = counter-1;
                }
            }
            else{

            }
        }
        return counter;
    }
}