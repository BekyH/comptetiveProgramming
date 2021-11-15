import java.io.*;
import java.util.*;
 
 
public class qt6{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      Long [] arr = new Long[n];
      for(int i=0;i<n;i++){
        arr[i] = sc.nextLong();

      }
      long coin = 0;
      long zeros = 0;
      long num_negatives = 0;
      for(int i=0;i<n;i++){
          if(arr[i]==0){
            zeros++;
          }
          else if(arr[i]<0){
            coin = coin + (-1-arr[i]);
            num_negatives++;
          }
          else{
              coin = coin + arr[i]-1;
          }
      }
      if(num_negatives%2==0){
        out.println(coin+zeros);
      }
      else{
        if(zeros>0){
          out.println(coin+zeros);
        }
        else{
          out.println(coin+2);
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