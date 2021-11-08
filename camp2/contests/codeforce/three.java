import java.io.*;
import java.util.*;
 
 
public class three{
   public static void main(String[] args) {
      MyScanner sc = new MyScanner();
      out = new PrintWriter(new BufferedOutputStream(System.out));
      int n = sc.nextInt();
      for(int i=0;i<n;i++){
        int p = sc.nextInt();
        int [] arr = new int[p];
        for(int j=0;j<p;j++){
            arr[j] = sc.nextInt();
           
        }
        List<Integer> lst = new ArrayList<>();
        String res = threeIndices(arr, lst);
        if(res=="YES"){
            out.println(res);
            for(int k=0;k<lst.size();k++){
                out.print(lst.get(k)+1 + " ");
            }
            out.println();
        }
        else{
            out.println(res);
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
   public static String threeIndices(int[] arr,List<Integer> lst){
        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1] ){
                lst.add(i-1);
                lst.add(i);
                lst.add(i+1);
              return "YES";  
            }
        }
        return "NO";
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