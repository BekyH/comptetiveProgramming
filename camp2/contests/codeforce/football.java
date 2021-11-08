import java.io.*;
import java.util.*;
 
 
public class football{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      int k = sc.nextInt();
      HashSet<Integer> set = new HashSet();
      int[] arr = new int[8];
      List<List<Integer>> matches = new ArrayList<>();
      int index=0;
      for(int i=1;i<=n;i++){
            arr[index++] = i;
      }
      for(int i=0;i<n;i++){
          int counter=0;
          List<Integer> lst = new ArrayList<>();
        for(int j=0;j<n;j++){
            int num = arr[i] + arr[j];
            if(i!=j && !set.contains(num)){
                lst.add(arr[i]);
                lst.add(arr[j]);
                set.add(num);
                matches.add(lst);
                 counter++;

            }

            if(counter==k){
                break;
            }
        }

      }
      if(matches.size()!=n){
        out.println(-1);
        return;
      }
      out.println(n);
      for(List<Integer> lst:matches){
        for(int i:lst){
            out.print(i + " ");
        }
        out.println();
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