import java.io.*;
import java.util.*;
 
 
public class mice{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int t = sc.nextInt();
      
      
      for(int j=0;j<t;j++){

        long n = sc.nextLong();
        long k = sc.nextLong();
        //long [] arr = new long[k];
        List<Long> arr = new ArrayList<>();
      for(long i=0;i<k;i++){
           long e = sc.nextLong();
           arr.add(e);
      }
      long curr = micecat(arr, k, n);
      out.println(curr);
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

     public static long micecat(List<Long>arr,long k,long n){
            Collections.sort(arr);
            long catpos = 0;
            long counter=0;
            for(int i=(int)k-1;i>=0;i--){
                if(catpos<arr.get(i)){
                    catpos = catpos + (n-arr.get(i));
                    counter++; 

                }
                else{
                    break;
                }
            }
            return counter;
           
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