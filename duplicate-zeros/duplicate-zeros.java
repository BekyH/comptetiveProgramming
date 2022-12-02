class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int index = 0;
        for (int i=0;i<n;i++){
              if(index>=n){
                  break;
              }
              res[index] = arr[i];
              
              if(arr[i]==0){
                  index++;
              }
              
            index++;
              
        }
        for(int i=0;i<n;i++){
            arr[i] = res[i];
        }
            
        
            
        } 
        
    }
