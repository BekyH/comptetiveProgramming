
import java.io.*;
import java.util.*;

import javax.print.event.PrintEvent;
 
 
public class rooms{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      int m = sc.nextInt();
      Long [] dorms = new Long[n];
      Long [] rooms = new Long [m];
      for(int i=0;i<n;i++){
        dorms[i] = sc.nextLong();
        

      }
      for(int j=0;j<m;j++){
        rooms[j] = sc.nextLong();
        
      }
      Set<Long> set = new HashSet<>();
      Long [] prefix = new Long[n];
      prefix[0] = dorms[0];

      for(int i=1;i<n;i++){
        prefix[i] = prefix[i-1] + dorms[i];
      }
      int left = 0;
     Long prev = (long)0;
      for(int j=0;j<rooms.length;j++){
            while(left<prefix.length && rooms[j]>prefix[left]){
                prev = prefix[left];
                left++;
            }
            out.println((left+1) + " " + (rooms[j]-prev));
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