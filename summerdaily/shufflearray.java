public class shufflearray{
    int [] numsarr;
    int[] orginalarr;
    public shufflearray(int[] nums) {
         orginalarr=nums.clone();
        numsarr = nums;
       
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return orginalarr;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int n = numsarr.length;
            for(int i=0;i<n;i++){
               	int randIdx = (int)(Math.random() * n);
                int temp = numsarr[randIdx];
                numsarr[randIdx] = numsarr[i];
                numsarr[i] = temp;
            } 
        return numsarr;
      
    }
}