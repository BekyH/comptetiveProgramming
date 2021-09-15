public class shiftletters {
    public String shiftingLetters(String s, int[] shifts) {
        int n = shifts.length;
        long [] shiftsSuffixSum = new long[n];
           shiftsSuffixSum[n-1] = shifts[n-1];
   
            for(int i=n-2;i>=0;i--){
            
            shiftsSuffixSum[i] = shiftsSuffixSum[i+1] + shifts[i]; 
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<n;i++){
                
                long shifting = s.charAt(i) + shiftsSuffixSum[i];
              
                if(shifting>122){
                 long diff = shifting-123;
                 long x = 97 + (diff%26);
                    sb.append((char)x);  
                }
                else{
                   sb.append((char)shifting);  
                }
            }
          
           return sb.toString();
       }
   
}
