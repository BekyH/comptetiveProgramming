import java.util.*;

public class hindexI {
    public int hIndex(int[] citations) {


        Arrays.sort(citations);
        int n = citations.length;
        int hindex = 0;

        for(int i = 0;i<n;i++){
            if(citations[i]>=(n-i)){
                hindex++;
            }
        }
        return hindex;


    }
}
