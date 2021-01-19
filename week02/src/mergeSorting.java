public class mergeSorting {
    public static void main(String [] args){
        int[] arr = {1,6,3,4,8,9,0,0,2,3,2,1};
        msort(arr,0,arr.length-1);
        printArray(arr);


    }
    static void mergeSort(int[] arr,int beg,int mid,int end){

        int left = mid-beg+1;
        int right = end-mid;

        int []leftArr = new int[left];
        int []rightArr = new int[right];

        for(int i = 0;i<left;i++){
            leftArr[i]=arr[beg+i];

        }
        for(int j = 0;j<right;j++){
            rightArr[j]=arr[mid+1+j];

        }

        int i = 0;
        int j = 0;
        int k = beg;
        while(i<left && j<right){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;

            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;

        }
        while(i<left){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<right){
            arr[k]=rightArr[j];
            j++;
            k++;
        }








    }
   static void msort(int[] arr,int beg,int end){
        if(beg<end){
            int mid = (beg+end-1)/2;
            msort(arr,beg,mid);
            msort(arr,mid+1,end);
            mergeSort(arr,beg,mid,end);
        }

    }
   static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
    }


}
