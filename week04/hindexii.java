public class hindexii {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0;
        int right = n-1;
        int hindex = 0;
        while(left<=right){
            int mid = left + ((right-left)/2);

            if(citations[mid]>=(n-mid)){
                hindex = (n-mid);

                right = mid-1;


            }
            else{

                left = mid +1;
            }

        }
        // return binarySearch(citations,start,end,hindex,n);
        return hindex;


    }
    public int binarySearch(int[] citations,int left,int right,int hindex,int n){
        if(left>right){
            return hindex;
        }
        int mid = left + ((right-left)/2);

        if(citations[mid]>=(n-mid)){
            hindex = (n-mid);
            System.out.println(hindex);
            right = mid-1;


        }
        else{

            left = mid +1;
        }
        return binarySearch(citations,left,right,hindex,n);
    }
}
