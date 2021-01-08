public class Bubble {

    public static void main(String[] args){
        int[] arr = {20,35,55,-15,0,1,7,55,1,-22};
        printArray(arr);
        bubbleSort(arr,10);
        printArray(arr);
    }

    static void bubbleSort(int[] arr,int n) {

        if (n < 1) {
            return;
        } else {
            for (int i = 0; i < n-1 ; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            bubbleSort(arr, n - 1);
        }





    }
    public static void printArray(int[] arr){
        for(int x:arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }


}
