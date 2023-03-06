class Solution {
    public int findKthPositive(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int missingNum=0;
        int counter=0;
        for(int i:arr){
            set.add(i);
        }
        int num=1;
        while(true){
            if(set.contains(num)){
                
            }
            else{
                counter++;
            }
            if(counter==k){
                missingNum = num;
                break;
            }
            num++;
        }
        return missingNum;
    }
}