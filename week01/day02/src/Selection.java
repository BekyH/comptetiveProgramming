public class Selection {

    public static void main(String[] args){
        int [] arr = {20,35,-15,7,20,55,1,30,-22,55};
        printArray(arr);
        selectionSort(arr,10);
        printArray(arr);

    }

    static void selectionSort(int [] arr,int n){
        if(n<1){
            return;


        }
        else {
            int t = 0;

            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    t = i;

                }
            }
            int temp = arr[n - 1];
            arr[n - 1] = max;
            arr[t] = temp;


            selectionSort(arr, n - 1);
        }

    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }


}
