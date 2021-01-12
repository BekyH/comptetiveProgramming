import java.util.Arrays;

public class markandtoys {
    public static void main(String [] args){
        int [] pr = {1,2,3,4};
        int [] pr2 = {1,12,5,111,200,1000,10};
        int k2 = 50;
        int k = 7;
       System.out.println(maximumToys(pr,k));
        System.out.println(maximumToys(pr2,k2));
    }
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int counter =0;
        int tot =0;
        for(int i=0;i<prices.length;i++){
            if((tot + prices[i])<k){
                tot = tot + prices[i];
                counter++;
            }
        }
        return counter;

    }

}
