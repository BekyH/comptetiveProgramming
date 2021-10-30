import java.io.*;
import java.util.*;
 
 
public class CodeforcesTemplate{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      
      out = new PrintWriter(new BufferedOutputStream(System.out));
            Set<Integer> setx = new HashSet<>();
            Set<Integer> sety = new HashSet<>();
            int n = sc.nextInt();
          int ax = sc.nextInt();
          int ay = sc.nextInt();
          int bx = sc.nextInt();
          int by = sc.nextInt();
          int cx = sc.nextInt();
          int cy = sc.nextInt();
          if(ax-ay==0 && cx-cy==0){
                out.println("NO");
                
          }
         else{

          int a = 0;
          int b = 0;
          int c = 0;
          int d = 0;
          if(bx>cx){
            a = bx;
            b = cx;
          }
          else{
              a = cx;
              b = bx;
          }
          if(by>cy){
            c = by;
            d = cy;
          }
          else{
              c = cy;
              d = by;
          }

        for(int i=b;i<=a;i++){
            setx.add(i);
        }
        for(int j=d;j<=c;j++){
            sety.add(j);
        }

        if(setx.contains(ax) || sety.contains(ay)){
            // System.out.println(c);
            // System.out.println(d);
            out.println("NO");
        }
        else{
            // System.out.println(c);
            // System.out.println(d);
            out.println("YES");
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