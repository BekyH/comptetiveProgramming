import java.io.*;
import java.util.*;
 
 
public class q3{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
           // Start writing your solution here. -------------------------------------
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int[][] mat = new int[2][m];
            for(int k=0;k<2;k++){
                for(int j=0;j<m;j++){
                    mat[k][j] =sc.nextInt(); 
                }
            }
            for(int a=1;a<m;a++){
                mat[0][a] = mat[0][a] + mat[0][a-1];
            }
            // for(int a=0;a<m;a++){
            //     out.println(mat[0][a]);
            // }
            for(int a=m-2;a>=0;a--){
                mat[1][a] = mat[1][a] + mat[1][a+1];
            }
            // for(int a=m-1;a>=0;a--){
            //     out.println(mat[1][a]);
            // }
            int max_score = Integer.MAX_VALUE;
            for(int j=0;j<m;j++){
                int curr = Math.max(mat[0][m-1]-mat[0][j],mat[1][0]-mat[1][j]);
                max_score = Math.min(curr,max_score);
            }
            out.println(max_score);

        }
      
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