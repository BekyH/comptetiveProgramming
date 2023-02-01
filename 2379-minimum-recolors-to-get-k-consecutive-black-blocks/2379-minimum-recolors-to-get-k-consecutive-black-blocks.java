class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0;
        int right = k;
        int counter =0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                counter++;
            }
        }
     
        int ans = counter;
        while(right<blocks.length()){
              if(blocks.charAt(left)=='W'){
                  counter--;
              }
             
              if(right<blocks.length() && blocks.charAt(right)=='W'){
                  counter++;
              }
            
            ans = Math.min(ans,counter);
            
             left++;
              right++;
        }
        
        return ans;
    }
}