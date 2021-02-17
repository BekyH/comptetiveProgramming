import java.util.ArrayList;
import java.util.Collections;

public class hindexI {
    public int hIndex(int[] citations) {
        int n = citations.length;
        if(n==0){
            return 0;
        }
        if(n==1 && citations[0]>0){
            return n;
        }
        if(n==1 && citations[0]==0){
            return 0;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for(int h = 0;h<n;h++){

            int counter = 0;

            for(int i = 0;i<n;i++){
                if(citations[i]>=h){
                    counter++;
                }

            }
            if(counter>=h){
                int temp = n-h;
                int counterLess = 0;
                for(int j = 0;j<n;j++){
                    if(citations[j]<=h){
                        counterLess++;

                    }

                }
                if(counterLess>=temp){
                    arr.add(h);


                }

            }

        }
        if(arr.size()>=1){
            int hindex = Collections.max(arr);
            return hindex;
        }
        else{
            return n;
        }



    }
}
