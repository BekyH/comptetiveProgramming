public class countingbits {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        int index = 0;
        int k=0;
        for(int i=0;i<=n;i++){
            String str = Integer.toBinaryString(i);
            long binary = Long.parseLong(str);
            
            while(binary>0){
                long x = binary%10;
                binary = binary/10;
                if(x==1){
                  k = k+1;  
                }
                
            }
            
            res[index++] = k;
            k=0;
        }
        return res;
    }
}
