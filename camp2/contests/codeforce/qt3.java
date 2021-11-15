import java.io.*;
import java.util.*;
 
 
public class qt3{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      int [] q = new int[n];;
        for(int i=0;i<n;i++){
            q[i] = sc.nextInt();
        }
        HashMap<Integer,List<Integer>> sup = new HashMap<>();
        HashMap<Integer,Integer> sub = new HashMap<>();
        int app = sc.nextInt();
        for(int j=0;j<app;j++){
            int su = sc.nextInt();
            int sb = sc.nextInt();
            int co = sc.nextInt();
            if(sub.containsKey(sb)){
                int val = sub.get(sb);
                int minc = Math.min(co,val);
                sub.put(sb,minc);
            }
            else{
                sub.put(sb,     co);
            }
        }
        if(sub.size()<n-1){
            out.println(-1);
        }
        else{
            int mincost = 0;
            for(Map.Entry<Integer,Integer> e:sub.entrySet()){
                mincost = mincost + e.getValue();
            }
            out.println(mincost);
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