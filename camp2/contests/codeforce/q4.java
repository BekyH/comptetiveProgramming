import java.io.*;
import java.util.*;
 
 
public class q4{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
        String str = sc.nextLine();
        int left = 0;
        int right = 0;
        int min = Integer.MAX_VALUE;
        HashMap<Character,Integer> hashmap = new HashMap<>();
        while(right<str.length()){
            if(hashmap.containsKey(str.charAt(right))){
                int val = hashmap.get(str.charAt(right));
                val = val+1;
                hashmap.put(str.charAt(right),val);

            }
            else{
                hashmap.put(str.charAt(right), 1);
            }
            while(hashmap.size()==3 && left<right){
                int curr = right-left + 1;
                min = Math.min(min, curr);
                int va = hashmap.get(str.charAt(left));
                va =va-1;
                if(va==0){
                    hashmap.remove(str.charAt(left));
                }
                else{
                    hashmap.put(str.charAt(left),va);
                }
                
                left++;
            }
           
            right++;
        }
        if(min==Integer.MAX_VALUE){
            out.println(0);
        }
        else{
            out.println(min);
        }
        
      }
            // Start writing your solution here. -------------------------------------
   
      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String

      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */

      // Stop writing your solution here. -------------------------------------
      out.close();
   }
   

     

   //-----------PrintWriter for faster output---------------------------------
   public static PrintWriter out;
      
   //-----------MyScanner class for faster input----------
   public static class MyScanner {
      BufferedReader br;
      StringTokenizer st;
 
      public MyScanner() {
         br = new BufferedReader(new InputStreamReader(System.in));
      }
 
      String next() {
          while (st == null || !st.hasMoreElements()) {
              try {
                  st = new StringTokenizer(br.readLine());
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
          return st.nextToken();
      }
 
      int nextInt() {
          return Integer.parseInt(next());
      }
 
      long nextLong() {
          return Long.parseLong(next());
      }
 
      double nextDouble() {
          return Double.parseDouble(next());
      }
 
      String nextLine(){
          String str = "";
    try {
       str = br.readLine();
    } catch (IOException e) {
       e.printStackTrace();
    }
    return str;
      }

   }
   //--------------------------------------------------------
}