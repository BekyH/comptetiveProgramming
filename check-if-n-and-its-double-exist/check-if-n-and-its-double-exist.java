class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int n = num * 2;
           // System.out.println(n);
            if(binary_search(arr,n,i)){
                return true;
            }
        }
        return false;
    }

    public boolean binary_search(int [] arr,int target, int index){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
          //  System.out.println("here");
            int mid = left + (right-left)/2;
            if(arr[mid]==target && mid!=index){
                return true;
            }
            else if(arr[mid]>target){
                right = mid-1;
            }
            else{
                left = mid +1;
            }
        }
        
        return false;
    }
}