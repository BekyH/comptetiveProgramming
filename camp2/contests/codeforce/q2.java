import java.io.*;
import java.util.*;
 
 
public class q2{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int t = sc.nextInt();
      
      for(int i=0;i<t;i++){
        List<List<Integer>> list = new ArrayList<>();
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        lst.add(n-1);
        lst.add(n);
        list.add(lst);
        int x = n-2;
        int y = n;
        while(x>0){
            lst = new ArrayList<>();
            lst.add(x);
            lst.add(y);
            list.add(lst);
            x--;
            y--;
           
        }
        out.println(2);
        for(List<Integer> lt:list){
            out.print(lt.get(0) + " ");
            out.println(lt.get(1));
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