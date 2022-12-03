class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        boolean is_found = false;
        for(int i=0;i<arr.length;i++){
            int left = 0;
            int right = arr.length-1;
            double curr = arr[i]/2.0;
            while(left<=right){
                int mid = left + (right-left)/2;
                
                    double mi = (double)arr[mid];
                    if(curr==mi && i!=mid){
                        is_found = true;
                        break;
                    }
                    else if(mi>curr){
                          right--;
                    }
                    else{
                        left++;
                    }
                
                
            }
            if(is_found){
              //  System.out.println(curr);
                return true;
            }
        }
        
        return false;
    }
}