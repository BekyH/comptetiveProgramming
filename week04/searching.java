public class searching {
        public static void main(String[] args){
            int [] arr = {-1,0,3,5,9,12};
            int i = BinarySearch(arr,9);
            System.out.println(i);
        }

    public static int BinarySearch(int [] arr,int target){

        return search(arr,target,0,arr.length-1);
    }
    public static int search(int[] arr,int target,int left,int right){
         if(left>right){
             return -1;
         }
         int mid = left + (right-left)/2;
         if(arr[mid]==target){
            return mid;
         }
         else if(target<arr[mid]){
            return search(arr,target,left,mid-1);
         }
         else{
             return search(arr,target,mid +1,right);
         }

    }
}
