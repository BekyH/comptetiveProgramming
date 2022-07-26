class Solution {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> result = new ArrayList<>();
        if(finalSum%2==1){
            return result;
        }
        long i = 2;
        long running_sum = 0;
        while((running_sum+i)<=finalSum){
            running_sum = running_sum+i;
            result.add(i);
            i = i+2;
        }
        if(running_sum==finalSum){
            return result;
        }
        long last = result.get(result.size()-1);
        long diff = finalSum-running_sum;
        last = last + diff;
        result.set(result.size()-1,last);
        return result;
    }
}