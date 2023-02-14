class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] temp = sorted(n);
     //   System.out.println(temp);
        for(int i = 0;i<=30;i++){
            int p = (int)Math.pow(2,i);
            int [] curr = sorted(p);
            if(Arrays.equals(curr,temp)){
                // System.out.println(temp);
                // System.out.println(sorted(p));
                return true;
            }
        }
        
        return false;
    }
    
    int[] sorted(int n){
       int [] arr = new int[10];
        while(n>0){
            int temp = n%10;
            arr[temp]++;
            n = n/10;
        }
           
        
        return arr;
    }
}